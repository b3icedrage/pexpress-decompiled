package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.base.feature.alertdialog.screen.DialogFullScreen;
import com.base.feature.robot.robot.account_selection.screens.RobotAccountSelectionPart;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: c10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC3063c10 implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Fragment e;

    public /* synthetic */ ViewOnClickListenerC3063c10(Fragment fragment, int i) {
        this.d = i;
        this.e = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.d) {
            case 0:
                DialogFullScreen dialogFullScreen = (DialogFullScreen) this.e;
                dialogFullScreen.h.m.invoke();
                if (dialogFullScreen.h.q) {
                    dialogFullScreen.dismiss();
                }
                break;
            default:
                Object obj = ((RobotAccountSelectionPart) this.e).i;
                Intrinsics.checkNotNull(obj);
                C1798Pu1 c1798Pu1 = (C1798Pu1) obj;
                c1798Pu1.getClass();
                C6561sS.g(c1798Pu1, new C1642Nu1(c1798Pu1, null));
                break;
        }
    }
}
