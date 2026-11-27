package defpackage;

import com.api.core.backend.domain.models.responseModels.CommonAccount;
import com.base.feature.robot.accountselection.screens.AccountSelectionFragment;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: h4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4123h4 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C4123h4(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                C5648o5 it = (C5648o5) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                Object obj2 = ((AccountSelectionFragment) this.e).g;
                Intrinsics.checkNotNull(obj2);
                C5434n4 c5434n4 = (C5434n4) obj2;
                CommonAccount account = it.a;
                c5434n4.getClass();
                Intrinsics.checkNotNullParameter(account, "account");
                C5189lv.k(C8056za.j(c5434n4), null, new C5644o4(c5434n4, account, null), 3);
                break;
            case 1:
                C1486Lv1 c1486Lv1 = (C1486Lv1) this.e;
                c1486Lv1.getClass();
                C5189lv.k(C8056za.j(c1486Lv1), null, new C1331Jv1(c1486Lv1, null), 3);
                c1486Lv1.m.g.c((Integer) obj, c1486Lv1.n());
                break;
            default:
                C4133h61 it2 = (C4133h61) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                C2119Tx1 c2119Tx1 = (C2119Tx1) this.e;
                it2.e(c2119Tx1.a.getString(R.string.connection_established_title));
                it2.d(c2119Tx1.a.getString(R.string.connection_established_text));
                it2.h = null;
                it2.i(0, false, 0);
                break;
        }
        return Unit.a;
    }
}
