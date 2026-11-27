package defpackage;

import androidx.lifecycle.LiveData;
import defpackage.AbstractC7844yZ0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class FZ0<T extends AbstractC7844yZ0> extends SA<T> {

    @NotNull
    public final EY0 e;

    @NotNull
    public final EY0 f;

    @NotNull
    public final EY0 g;

    @NotNull
    public final EY0 h;

    @NotNull
    public final EY0 i;

    @NotNull
    public final EY0 j;

    public FZ0(@NotNull M8 agentRepository) {
        Intrinsics.checkNotNullParameter(agentRepository, "agentRepository");
        LiveData liveData = this.d;
        C6634sm0 switchMapFunction = new C6634sm0(agentRepository, 4);
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(switchMapFunction, "switchMapFunction");
        EY0 ey0 = new EY0();
        ey0.l(liveData, new C7957z42(switchMapFunction, ey0));
        Intrinsics.checkNotNullExpressionValue(ey0, "switchMap(_entry) { entr….create()\n        }\n    }");
        this.e = ey0;
        Intrinsics.checkNotNullExpressionValue(C7747y42.a(ey0, new C4904ka0(2)), "map(agent) { agent ->\n  … agent?.photo ?: \"\"\n    }");
        EY0 ey0A = C7747y42.a(this.d, new C6419rl(3));
        Intrinsics.checkNotNullExpressionValue(ey0A, "map(_entry) { entry ->\n … -> false\n        }\n    }");
        this.f = ey0A;
        EY0 ey0A2 = C7747y42.a(ey0, new C2756ad0());
        Intrinsics.checkNotNullExpressionValue(ey0A2, "map(agent) { agent ->\n  …  agent?.name ?: \"\"\n    }");
        this.g = ey0A2;
        EY0 ey0A3 = C7747y42.a(this.d, new SI0());
        Intrinsics.checkNotNullExpressionValue(ey0A3, "map(_entry) { entry ->\n … -> false\n        }\n    }");
        this.h = ey0A3;
        EY0 ey0A4 = C7747y42.a(this.d, new C1742Pc(4));
        Intrinsics.checkNotNullExpressionValue(ey0A4, "map(_entry) { entry ->\n …ongOrDefault(0) < 0\n    }");
        this.i = ey0A4;
        EY0 ey0A5 = C7747y42.a(this.d, new C6495s7(4));
        Intrinsics.checkNotNullExpressionValue(ey0A5, "map(_entry) {\n        it.time\n    }");
        this.j = ey0A5;
    }
}
