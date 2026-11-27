package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3879fu0 {

    /* JADX INFO: renamed from: fu0$a */
    public static final class a {
        public static /* synthetic */ void enqueue$default(InterfaceC3879fu0 interfaceC3879fu0, Q91 q91, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueue");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            interfaceC3879fu0.enqueue(q91, z);
        }

        public static /* synthetic */ Object enqueueAndWait$default(InterfaceC3879fu0 interfaceC3879fu0, Q91 q91, boolean z, JM jm, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueueAndWait");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return interfaceC3879fu0.enqueueAndWait(q91, z, jm);
        }
    }

    @Nullable
    Object awaitInitialized(@NotNull JM<? super Unit> jm);

    <T extends Q91> boolean containsInstanceOf(@NotNull RI0<T> ri0);

    void enqueue(@NotNull Q91 q91, boolean z);

    @Nullable
    Object enqueueAndWait(@NotNull Q91 q91, boolean z, @NotNull JM<? super Boolean> jm);

    void forceExecuteOperations();
}
