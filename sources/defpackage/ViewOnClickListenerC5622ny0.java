package defpackage;

import android.view.View;
import com.api.feature.analytics.reporters.ReporterApi;
import com.base.feature.onboarding.screens.tutorial.TutorialFragment;
import com.base.feature.profileandsettings.profile.screens.ProfileFragmentBase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ny0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC5622ny0 implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ViewOnClickListenerC5622ny0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.e;
        switch (this.d) {
            case 0:
                ((C6461ry0) obj).z.invoke();
                break;
            case 1:
                Object obj2 = ((ProfileFragmentBase) obj).i;
                Intrinsics.checkNotNull(obj2);
                AbstractC8090zi1 abstractC8090zi1 = (AbstractC8090zi1) obj2;
                GP1 gp1 = abstractC8090zi1.j;
                Boolean bool = Boolean.TRUE;
                gp1.getClass();
                gp1.m(null, bool);
                GP1 gp2 = abstractC8090zi1.p;
                gp2.getClass();
                gp2.m(null, bool);
                break;
            default:
                int i = TutorialFragment.m;
                Object obj3 = ((TutorialFragment) obj).i;
                Intrinsics.checkNotNull(obj3);
                P52 p52 = (P52) obj3;
                p52.getClass();
                EnumC5028l80 enumC5028l80 = EnumC5028l80.i;
                L80 l80 = L80.MAX_PROFIT;
                ReporterApi.a.b(p52.e, enumC5028l80, new C1510Md1("Skipped"), VE.c(EnumC5326ma.g), 8);
                C5189lv.k(C8056za.j(p52), null, new N52(p52, null), 3);
                break;
        }
    }
}
