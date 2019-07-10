package com.app.designpattern.databinding;
import com.app.designpattern.R;
import com.app.designpattern.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentVerificationBindingImpl extends FragmentVerificationBinding implements com.app.designpattern.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener edtVerificationCodeandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of data.verificationRequest.OTP
            //         is data.verificationRequest.setOTP((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(edtVerificationCode);
            // localize variables for thread safety
            // data.verificationRequest.OTP
            java.lang.String dataVerificationRequestOTP = null;
            // data != null
            boolean dataJavaLangObjectNull = false;
            // data.verificationRequest
            com.app.designpattern.model.vo.UserVerification.Request dataVerificationRequest = null;
            // data.verificationRequest != null
            boolean dataVerificationRequestJavaLangObjectNull = false;
            // data
            com.app.designpattern.viewmodel.auth.VerificationViewModel data = mData;



            dataJavaLangObjectNull = (data) != (null);
            if (dataJavaLangObjectNull) {


                dataVerificationRequest = data.verificationRequest;

                dataVerificationRequestJavaLangObjectNull = (dataVerificationRequest) != (null);
                if (dataVerificationRequestJavaLangObjectNull) {




                    dataVerificationRequest.setOTP(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentVerificationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentVerificationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[2]
            , (android.widget.EditText) bindings[1]
            );
        this.btnVerify.setTag(null);
        this.edtVerificationCode.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.app.designpattern.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            setData((com.app.designpattern.viewmodel.auth.VerificationViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable com.app.designpattern.viewmodel.auth.VerificationViewModel Data) {
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
                return onChangeDataVerificationRequest((com.app.designpattern.model.vo.UserVerification.Request) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDataVerificationRequest(com.app.designpattern.model.vo.UserVerification.Request DataVerificationRequest, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.oTP) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        java.lang.String dataVerificationRequestOTP = null;
        com.app.designpattern.model.vo.UserVerification.Request dataVerificationRequest = null;
        com.app.designpattern.viewmodel.auth.VerificationViewModel data = mData;

        if ((dirtyFlags & 0xfL) != 0) {



                if (data != null) {
                    // read data.verificationRequest
                    dataVerificationRequest = data.verificationRequest;
                }
                updateRegistration(0, dataVerificationRequest);


                if (dataVerificationRequest != null) {
                    // read data.verificationRequest.OTP
                    dataVerificationRequestOTP = dataVerificationRequest.getOTP();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.btnVerify.setOnClickListener(mCallback2);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.edtVerificationCode, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, edtVerificationCodeandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xfL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtVerificationCode, dataVerificationRequestOTP);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // data != null
        boolean dataJavaLangObjectNull = false;
        // data
        com.app.designpattern.viewmodel.auth.VerificationViewModel data = mData;



        dataJavaLangObjectNull = (data) != (null);
        if (dataJavaLangObjectNull) {


            data.verifyUser();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data.verificationRequest
        flag 1 (0x2L): data
        flag 2 (0x3L): data.verificationRequest.OTP
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}