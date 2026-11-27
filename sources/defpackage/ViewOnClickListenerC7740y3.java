package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.base.feature.account.screens.maininfo.AccountMainInfoPartBase;
import com.base.feature.alertdialog.screen.AlertDialogWithCheckBox;
import com.base.feature.alertdialog.screen.DialogCoupon;
import com.base.feature.robot.robot.strategies.RobotStrategiesPart;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: y3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC7740y3 implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ViewOnClickListenerC7740y3(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.d) {
            case 0:
                Object obj = ((AccountMainInfoPartBase) this.e).i;
                Intrinsics.checkNotNull(obj);
                ((K3) obj).r();
                break;
            case 1:
                AlertDialogWithCheckBox alertDialogWithCheckBox = (AlertDialogWithCheckBox) this.e;
                alertDialogWithCheckBox.h.m.invoke();
                alertDialogWithCheckBox.dismiss();
                break;
            case 2:
                DialogCoupon dialogCoupon = (DialogCoupon) this.e;
                dialogCoupon.h.l.invoke();
                dialogCoupon.dismiss();
                break;
            case 3:
                C0650Bc1 c0650Bc1 = (C0650Bc1) this.e;
                EditText editText = c0650Bc1.f;
                if (editText != null) {
                    int selectionEnd = editText.getSelectionEnd();
                    EditText editText2 = c0650Bc1.f;
                    if (editText2 == null || !(editText2.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        c0650Bc1.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        c0650Bc1.f.setTransformationMethod(null);
                    }
                    if (selectionEnd >= 0) {
                        c0650Bc1.f.setSelection(selectionEnd);
                    }
                    c0650Bc1.q();
                    break;
                }
                break;
            default:
                Object obj2 = ((RobotStrategiesPart) this.e).i;
                Intrinsics.checkNotNull(obj2);
                ((C7936yz1) obj2).e.a();
                break;
        }
    }
}
