package defpackage;

import android.view.Window;
import com.api.core.backend.domain.models.resultModels.CommonError;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: fN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3767fN0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C3767fN0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = this.e;
        switch (this.d) {
            case 0:
                CommonError error = (CommonError) obj;
                Intrinsics.checkNotNullParameter(error, "error");
                C3977gN0 c3977gN0 = (C3977gN0) obj2;
                KN kn = c3977gN0.u;
                if (kn == null) {
                    Intrinsics.l("scope");
                    throw null;
                }
                C5189lv.k(kn, C6266r20.a, new C5075lN0(c3977gN0, null), 2);
                MN0.a(c3977gN0.e, error, "Connection to server error");
                return Unit.a;
            case 1:
                Integer num = (Integer) obj;
                int i = ActivityC6781tV0.Q;
                ActivityC6781tV0 activityC6781tV0 = (ActivityC6781tV0) obj2;
                activityC6781tV0.getWindow().addFlags(Integer.MIN_VALUE);
                Window window = activityC6781tV0.getWindow();
                Intrinsics.checkNotNull(num);
                window.setStatusBarColor(C6333rM.getColor(activityC6781tV0, num.intValue()));
                return Unit.a;
            default:
                C4133h61 it = (C4133h61) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                C2119Tx1 c2119Tx1 = (C2119Tx1) obj2;
                it.e(c2119Tx1.a.getString(R.string.error_no_internet_title));
                it.d(c2119Tx1.a.getString(R.string.error_no_internet_description));
                it.h = null;
                it.i(0, false, 0);
                return Unit.a;
        }
    }
}
