package com.app.designpattern.databinding;
import com.app.designpattern.R;
import com.app.designpattern.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRegisterBindingImpl extends FragmentRegisterBinding implements com.app.designpattern.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView4, 7);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edtEmailandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of data.user.email
            //         is data.user.setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtEmail);
            // localize variables for thread safety
            // data.user.email
            java.lang.String dataUserEmail = null;
            // data.user
            com.app.designpattern.model.vo.User.RegisterRequest dataUser = null;
            // data != null
            boolean dataJavaLangObjectNull = false;
            // data.user != null
            boolean dataUserJavaLangObjectNull = false;
            // data
            com.app.designpattern.viewmodel.auth.RegisterViewModel data = mData;



            dataJavaLangObjectNull = (data) != (null);
            if (dataJavaLangObjectNull) {


                dataUser = data.user;

                dataUserJavaLangObjectNull = (dataUser) != (null);
                if (dataUserJavaLangObjectNull) {




                    dataUser.setEmail(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edtFnameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of data.user.firstName
            //         is data.user.setFirstName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtFname);
            // localize variables for thread safety
            // data.user
            com.app.designpattern.model.vo.User.RegisterRequest dataUser = null;
            // data != null
            boolean dataJavaLangObjectNull = false;
            // data.user != null
            boolean dataUserJavaLangObjectNull = false;
            // data
            com.app.designpattern.viewmodel.auth.RegisterViewModel data = mData;
            // data.user.firstName
            java.lang.String dataUserFirstName = null;



            dataJavaLangObjectNull = (data) != (null);
            if (dataJavaLangObjectNull) {


                dataUser = data.user;

                dataUserJavaLangObjectNull = (dataUser) != (null);
                if (dataUserJavaLangObjectNull) {




                    dataUser.setFirstName(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edtLnameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of data.user.lastName
            //         is data.user.setLastName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtLname);
            // localize variables for thread safety
            // data.user
            com.app.designpattern.model.vo.User.RegisterRequest dataUser = null;
            // data.user.lastName
            java.lang.String dataUserLastName = null;
            // data != null
            boolean dataJavaLangObjectNull = false;
            // data.user != null
            boolean dataUserJavaLangObjectNull = false;
            // data
            com.app.designpattern.viewmodel.auth.RegisterViewModel data = mData;



            dataJavaLangObjectNull = (data) != (null);
            if (dataJavaLangObjectNull) {


                dataUser = data.user;

                dataUserJavaLangObjectNull = (dataUser) != (null);
                if (dataUserJavaLangObjectNull) {




                    dataUser.setLastName(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edtPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of data.user.password
            //         is data.user.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtPassword);
            // localize variables for thread safety
            // data.user
            com.app.designpattern.model.vo.User.RegisterRequest dataUser = null;
            // data != null
            boolean dataJavaLangObjectNull = false;
            // data.user != null
            boolean dataUserJavaLangObjectNull = false;
            // data
            com.app.designpattern.viewmodel.auth.RegisterViewModel data = mData;
            // data.user.password
            java.lang.String dataUserPassword = null;



            dataJavaLangObjectNull = (data) != (null);
            if (dataJavaLangObjectNull) {


                dataUser = data.user;

                dataUserJavaLangObjectNull = (dataUser) != (null);
                if (dataUserJavaLangObjectNull) {




                    dataUser.setPassword(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener edtPhoneandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of data.user.phone
            //         is data.user.setPhone((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtPhone);
            // localize variables for thread safety
            // data.user.phone
            java.lang.String dataUserPhone = null;
            // data.user
            com.app.designpattern.model.vo.User.RegisterRequest dataUser = null;
            // data != null
            boolean dataJavaLangObjectNull = false;
            // data.user != null
            boolean dataUserJavaLangObjectNull = false;
            // data
            com.app.designpattern.viewmodel.auth.RegisterViewModel data = mData;



            dataJavaLangObjectNull = (data) != (null);
            if (dataJavaLangObjectNull) {


                dataUser = data.user;

                dataUserJavaLangObjectNull = (dataUser) != (null);
                if (dataUserJavaLangObjectNull) {




                    dataUser.setPhone(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentRegisterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentRegisterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[6]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[5]
            , (android.widget.EditText) bindings[4]
            , (android.widget.TextView) bindings[7]
            );
        this.btnSubmit.setTag(null);
        this.edtEmail.setTag(null);
        this.edtFname.setTag(null);
        this.edtLname.setTag(null);
        this.edtPassword.setTag(null);
        this.edtPhone.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.app.designpattern.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.data == variableId) {
            setData((com.app.designpattern.viewmodel.auth.RegisterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable com.app.designpattern.viewmodel.auth.RegisterViewModel Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDataUser((com.app.designpattern.model.vo.User.RegisterRequest) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDataUser(com.app.designpattern.model.vo.User.RegisterRequest DataUser, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.firstName) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.lastName) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.email) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.phone) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.password) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String dataUserPhone = null;
        com.app.designpattern.model.vo.User.RegisterRequest dataUser = null;
        java.lang.String dataUserFirstName = null;
        java.lang.String dataUserEmail = null;
        com.app.designpattern.viewmodel.auth.RegisterViewModel data = mData;
        java.lang.String dataUserPassword = null;
        java.lang.String dataUserLastName = null;

        if ((dirtyFlags & 0xffL) != 0) {



                if (data != null) {
                    // read data.user
                    dataUser = data.user;
                }
                updateRegistration(0, dataUser);

            if ((dirtyFlags & 0xa3L) != 0) {

                    if (dataUser != null) {
                        // read data.user.phone
                        dataUserPhone = dataUser.getPhone();
                    }
            }
            if ((dirtyFlags & 0x87L) != 0) {

                    if (dataUser != null) {
                        // read data.user.firstName
                        dataUserFirstName = dataUser.getFirstName();
                    }
            }
            if ((dirtyFlags & 0x93L) != 0) {

                    if (dataUser != null) {
                        // read data.user.email
                        dataUserEmail = dataUser.getEmail();
                    }
            }
            if ((dirtyFlags & 0xc3L) != 0) {

                    if (dataUser != null) {
                        // read data.user.password
                        dataUserPassword = dataUser.getPassword();
                    }
            }
            if ((dirtyFlags & 0x8bL) != 0) {

                    if (dataUser != null) {
                        // read data.user.lastName
                        dataUserLastName = dataUser.getLastName();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.btnSubmit.setOnClickListener(mCallback3);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtEmail, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtEmailandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtFname, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtFnameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtLname, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtLnameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtPasswordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtPhone, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtPhoneandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x93L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtEmail, dataUserEmail);
        }
        if ((dirtyFlags & 0x87L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtFname, dataUserFirstName);
        }
        if ((dirtyFlags & 0x8bL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtLname, dataUserLastName);
        }
        if ((dirtyFlags & 0xc3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtPassword, dataUserPassword);
        }
        if ((dirtyFlags & 0xa3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtPhone, dataUserPhone);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // data != null
        boolean dataJavaLangObjectNull = false;
        // data
        com.app.designpattern.viewmodel.auth.RegisterViewModel data = mData;



        dataJavaLangObjectNull = (data) != (null);
        if (dataJavaLangObjectNull) {


            data.registerUser();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data.user
        flag 1 (0x2L): data
        flag 2 (0x3L): data.user.firstName
        flag 3 (0x4L): data.user.lastName
        flag 4 (0x5L): data.user.email
        flag 5 (0x6L): data.user.phone
        flag 6 (0x7L): data.user.password
        flag 7 (0x8L): null
    flag mapping end*/
    //end
}