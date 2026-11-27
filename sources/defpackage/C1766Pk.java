package defpackage;

import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Pk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1766Pk implements JN1 {

    @NotNull
    public final InterfaceC7759y72 a;

    public C1766Pk(@NotNull InterfaceC7759y72 typingRepository) {
        Intrinsics.checkNotNullParameter(typingRepository, "typingRepository");
        this.a = typingRepository;
    }

    @Override // defpackage.JN1
    public final void a(@NotNull SocketMessage message) {
        Long lC0;
        Intrinsics.checkNotNullParameter(message, "message");
        String str = message.c;
        if (str == null || (lC0 = StringsKt.c0(str)) == null) {
            return;
        }
        long jLongValue = lC0.longValue();
        String str2 = message.b;
        if (str2 == null) {
            str2 = "";
        }
        this.a.p(str2, jLongValue);
    }
}
