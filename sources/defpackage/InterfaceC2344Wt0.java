package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Wt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC2344Wt0 {

    /* JADX INFO: renamed from: Wt0$a */
    public static final class a {
        public static /* synthetic */ Object processNotification$default(InterfaceC2344Wt0 interfaceC2344Wt0, InterfaceC2262Vt0.b bVar, int i, JM jm, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processNotification");
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return interfaceC2344Wt0.processNotification(bVar, i, jm);
        }
    }

    @Nullable
    Object process(@NotNull JM<? super Unit> jm);

    @Nullable
    Object processNotification(@NotNull InterfaceC2262Vt0.b bVar, int i, @NotNull JM<? super Unit> jm);
}
