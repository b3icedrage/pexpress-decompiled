package defpackage;

import androidx.lifecycle.LiveData;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Pn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1776Pn0<R> {

    @NotNull
    public final EY0<C3457dt1<R>> a;

    /* JADX INFO: renamed from: Pn0$a */
    public static final class a<R> {

        @NotNull
        public final InterfaceC5889pD1 a;

        @Nullable
        public C5531nY0 b;

        @Nullable
        public C5741oY0 c;

        public a(@NotNull InterfaceC5889pD1 schedulers) {
            Intrinsics.checkNotNullParameter(schedulers, "schedulers");
            this.a = schedulers;
        }
    }

    public AbstractC1776Pn0(@NotNull InterfaceC5889pD1 schedulers) {
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        this.a = new EY0<>();
        schedulers.b().execute(new RunnableC2555Zd(this, 5));
    }

    @NotNull
    public abstract LiveData<C4705jd<Void>> a();

    @NotNull
    public abstract R b(@NotNull Map<String, ? extends List<String>> map);
}
