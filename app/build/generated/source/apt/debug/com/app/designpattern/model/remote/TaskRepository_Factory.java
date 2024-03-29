// Generated by Dagger (https://google.github.io/dagger).
package com.app.designpattern.model.remote;

import com.app.designpattern.MyApplication;
import com.app.designpattern.model.APIServices;
import com.app.designpattern.util.SessionManager;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class TaskRepository_Factory implements Factory<TaskRepository> {
  private final Provider<APIServices> apiServicesProvider;

  private final Provider<SessionManager> sessionManagerProvider;

  private final Provider<MyApplication> applicationProvider;

  public TaskRepository_Factory(
      Provider<APIServices> apiServicesProvider,
      Provider<SessionManager> sessionManagerProvider,
      Provider<MyApplication> applicationProvider) {
    this.apiServicesProvider = apiServicesProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public TaskRepository get() {
    return provideInstance(apiServicesProvider, sessionManagerProvider, applicationProvider);
  }

  public static TaskRepository provideInstance(
      Provider<APIServices> apiServicesProvider,
      Provider<SessionManager> sessionManagerProvider,
      Provider<MyApplication> applicationProvider) {
    return new TaskRepository(
        apiServicesProvider.get(), sessionManagerProvider.get(), applicationProvider.get());
  }

  public static TaskRepository_Factory create(
      Provider<APIServices> apiServicesProvider,
      Provider<SessionManager> sessionManagerProvider,
      Provider<MyApplication> applicationProvider) {
    return new TaskRepository_Factory(
        apiServicesProvider, sessionManagerProvider, applicationProvider);
  }

  public static TaskRepository newTaskRepository(
      APIServices apiServices, SessionManager sessionManager, MyApplication application) {
    return new TaskRepository(apiServices, sessionManager, application);
  }
}
