package defpackage;

import android.view.View;
import android.widget.Checkable;
import com.api.core.backend.domain.models.resultModels.ResultOk;
import com.api.resources.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MB implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ MB(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                View it = (View) obj;
                int[] iArr = a.A;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it instanceof Checkable);
            case 1:
                String segment = (String) obj;
                Intrinsics.checkNotNullParameter(segment, "segment");
                return C6018pq0.d.d(segment) ? "{id}" : segment;
            case 2:
                View it2 = (View) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return C4559iy0.b(it2);
            case 3:
                YU0 it3 = (YU0) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return Double.valueOf(it3.c[2]);
            default:
                ResultOk it4 = (ResultOk) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return Boolean.valueOf((it4.a() instanceof C2337Wr) || (it4.a() instanceof C2099Tr));
        }
    }
}
