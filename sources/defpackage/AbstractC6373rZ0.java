package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6373rZ0<T> {

    /* JADX INFO: renamed from: rZ0$a */
    public static final class a<T> extends AbstractC6373rZ0<T> {

        @NotNull
        public final AW1 a;

        @NotNull
        public final DG b;

        @Nullable
        public final EP1<T> c;

        @NotNull
        public final CoroutineContext d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Function2 transform, @NotNull DG ack, @Nullable EP1 ep1, @NotNull CoroutineContext callerContext) {
            Intrinsics.checkNotNullParameter(transform, "transform");
            Intrinsics.checkNotNullParameter(ack, "ack");
            Intrinsics.checkNotNullParameter(callerContext, "callerContext");
            this.a = (AW1) transform;
            this.b = ack;
            this.c = ep1;
            this.d = callerContext;
        }
    }
}
