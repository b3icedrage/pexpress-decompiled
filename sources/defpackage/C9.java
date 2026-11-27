package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.base.feature.alertdialog.screen.AlertDialogRotated;
import com.impl.feature.activation.register.ReRegistrationFragmentImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9 implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Fragment e;

    public /* synthetic */ C9(Fragment fragment, int i) {
        this.d = i;
        this.e = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.d) {
            case 0:
                AlertDialogRotated alertDialogRotated = (AlertDialogRotated) this.e;
                alertDialogRotated.h.l.invoke();
                alertDialogRotated.dismiss();
                break;
            default:
                Object obj = ((ReRegistrationFragmentImpl) this.e).i;
                Intrinsics.checkNotNull(obj);
                C5800on1 c5800on1 = (C5800on1) obj;
                C1273Jc0 c1273Jc0 = c5800on1.d;
                if (c1273Jc0.b) {
                    c1273Jc0.b = false;
                }
                c1273Jc0.d = false;
                c5800on1.e.setValue(c1273Jc0.c());
                C1273Jc0 c1273Jc1 = c5800on1.n;
                if (c1273Jc1.b) {
                    c1273Jc1.b = false;
                }
                c1273Jc1.d = false;
                c5800on1.o.setValue(c1273Jc1.c());
                break;
        }
    }
}
