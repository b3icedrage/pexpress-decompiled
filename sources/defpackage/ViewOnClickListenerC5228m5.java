package defpackage;

import android.view.View;
import com.base.feature.alertdialog.screen.RateAppDialog;
import com.base.feature.registration.screens.authorization.AuthorizationFragmentBase;

/* JADX INFO: renamed from: m5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC5228m5 implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ViewOnClickListenerC5228m5(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.d) {
            case 0:
                C5438n5 c5438n5 = (C5438n5) this.e;
                C5648o5 c5648o5 = c5438n5.x;
                if (c5648o5 != null) {
                    c5438n5.w.invoke(c5648o5);
                }
                break;
            case 1:
                ((AuthorizationFragmentBase) this.e).r.a();
                break;
            case 2:
                RateAppDialog rateAppDialog = (RateAppDialog) this.e;
                rateAppDialog.h.s.invoke(((C6216qm1) rateAppDialog.i()).h.getOptionalStarCount());
                rateAppDialog.i = true;
                rateAppDialog.dismiss();
                break;
            default:
                AZ1 az1 = (AZ1) this.e;
                C1709Or c1709Or = az1.y;
                if (c1709Or != null) {
                    az1.w.invoke(c1709Or);
                }
                break;
        }
    }
}
