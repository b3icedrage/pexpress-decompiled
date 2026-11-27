package defpackage;

import androidx.lifecycle.LiveData;
import defpackage.AbstractC1075Go0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: lY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5108lY0<T extends AbstractC1075Go0> extends FZ0<T> {

    @NotNull
    public final InterfaceC5321mY0 k;

    @NotNull
    public final EY0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5108lY0(@NotNull M8 agentRepository, @NotNull InterfaceC5321mY0 mediaRepository) {
        super(agentRepository);
        Intrinsics.checkNotNullParameter(agentRepository, "agentRepository");
        Intrinsics.checkNotNullParameter(mediaRepository, "mediaRepository");
        this.k = mediaRepository;
        LiveData liveData = this.d;
        C6634sm0 switchMapFunction = new C6634sm0(this, 3);
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(switchMapFunction, "switchMapFunction");
        EY0 ey0 = new EY0();
        ey0.l(liveData, new C7957z42(switchMapFunction, ey0));
        Intrinsics.checkNotNullExpressionValue(ey0, "switchMap(_entry) {\n    …ate(path)\n        }\n    }");
        this.l = ey0;
    }
}
