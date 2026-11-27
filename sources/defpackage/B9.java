package defpackage;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.api.core.backend.domain.models.requestModels.CaptchaDestination;
import com.api.library.registration.screens.email.EmailFieldFragment;
import com.base.feature.alertdialog.screen.AlertDialogRotated;
import com.base.feature.onboarding.screens.tutorial.TutorialFragment;
import com.impl.feature.activation.register.ReRegistrationFragmentImpl;
import com.impl.feature.registration.screens.forgetpassword.ForgetPasswordFragmentImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B9 implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ B9(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object value;
        Object obj = this.e;
        switch (this.d) {
            case 0:
                AlertDialogRotated alertDialogRotated = (AlertDialogRotated) obj;
                alertDialogRotated.h.m.invoke();
                alertDialogRotated.dismiss();
                return;
            case 1:
                ((C4802k40) obj).u();
                return;
            case 2:
                EmailFieldFragment emailFieldFragment = (EmailFieldFragment) obj;
                A50 a50 = emailFieldFragment.j;
                a50.a().requestFocus();
                Context contextRequireContext = emailFieldFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Object systemService = C6333rM.getSystemService(contextRequireContext, InputMethodManager.class);
                if (systemService == null) {
                    throw new IllegalStateException("The class is not a supported system service.");
                }
                ((InputMethodManager) systemService).hideSoftInputFromWindow(a50.a().getWindowToken(), 0);
                return;
            case 3:
                ForgetPasswordFragmentImpl forgetPasswordFragmentImpl = (ForgetPasswordFragmentImpl) obj;
                Object obj2 = forgetPasswordFragmentImpl.i;
                Intrinsics.checkNotNull(obj2);
                ((C0664Bh0) obj2).r(new CaptchaDestination.RemindPass(0), false, new C4(forgetPasswordFragmentImpl, 2));
                return;
            case 4:
                Object obj3 = ((ReRegistrationFragmentImpl) obj).i;
                Intrinsics.checkNotNull(obj3);
                ((AbstractC1394Kq1) obj3).t();
                return;
            default:
                int i = TutorialFragment.m;
                Object obj4 = ((TutorialFragment) obj).i;
                Intrinsics.checkNotNull(obj4);
                GP1 gp1 = ((P52) obj4).h;
                do {
                    value = gp1.getValue();
                } while (!gp1.d(value, Integer.valueOf(((Number) value).intValue() - 1)));
                return;
        }
    }
}
