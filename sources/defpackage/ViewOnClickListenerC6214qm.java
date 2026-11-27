package defpackage;

import android.view.View;
import com.api.core.BaseFragment;
import com.api.core.backend.domain.models.requestModels.CaptchaDestination;
import com.api.feature.analytics.reporters.ReporterApi;
import com.api.feature.webpage.screen.WebViewFragment;
import com.base.feature.registration.screens.selecthaveaccount.SelectHaveAccountFragmentBase;
import com.impl.feature.registration.screens.authorization.AuthorizationFragmentImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC6214qm implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ BaseFragment e;

    public /* synthetic */ ViewOnClickListenerC6214qm(BaseFragment baseFragment, int i) {
        this.d = i;
        this.e = baseFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.d) {
            case 0:
                AuthorizationFragmentImpl authorizationFragmentImpl = (AuthorizationFragmentImpl) this.e;
                Object obj = authorizationFragmentImpl.i;
                Intrinsics.checkNotNull(obj);
                C2084Tm c2084Tm = (C2084Tm) obj;
                c2084Tm.getClass();
                ReporterApi.a.b(c2084Tm.I, EnumC5028l80.W0, null, null, 14);
                Object obj2 = authorizationFragmentImpl.i;
                Intrinsics.checkNotNull(obj2);
                C2084Tm.G((C2084Tm) obj2, new CaptchaDestination.Registration(0), new Q2(authorizationFragmentImpl, 1), 6);
                break;
            case 1:
                Object obj3 = ((SelectHaveAccountFragmentBase) this.e).i;
                Intrinsics.checkNotNull(obj3);
                UE1 ue1 = (UE1) obj3;
                ue1.d.a();
                C5189lv.k(C3784fT.a, C6266r20.c, new TE1(ue1, null), 2);
                break;
            default:
                Object obj4 = ((WebViewFragment) this.e).i;
                Intrinsics.checkNotNull(obj4);
                ((AbstractC4260hi2) obj4).l();
                break;
        }
    }
}
