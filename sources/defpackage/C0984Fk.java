package defpackage;

import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Fk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0984Fk implements JN1 {

    @NotNull
    public final InterfaceC1153Ho0 a;

    public C0984Fk(@NotNull InterfaceC1153Ho0 historyRepository) {
        Intrinsics.checkNotNullParameter(historyRepository, "historyRepository");
        this.a = historyRepository;
    }

    @Override // defpackage.JN1
    public final void a(@NotNull SocketMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String str = message.b;
        if (str != null) {
            if (StringsKt.I(str)) {
                str = null;
            }
            if (str != null) {
                this.a.L(str);
            }
        }
    }
}
