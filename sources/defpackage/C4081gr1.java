package defpackage;

import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: gr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4081gr1 implements OZ0 {

    @NotNull
    public final C3903g11 a;

    public C4081gr1(@NotNull C3903g11 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.a = moshi;
    }

    @Override // defpackage.OZ0
    @NotNull
    public final String a(@NotNull String msg, @NotNull SocketMessage socketMessage) {
        String str;
        String strB;
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(socketMessage, "socketMessage");
        if (Intrinsics.a(socketMessage.a, "text/plain") && (str = socketMessage.b) != null) {
            int length = str.length();
            if (1 > length || length >= 5) {
                strB = (5 > length || length >= 21) ? b(socketMessage, str, new IntRange(3, length - 4, 1)) : b(socketMessage, str, f.i(3, length));
            } else {
                strB = msg;
            }
            if (strB != null) {
                return strB;
            }
        }
        return msg;
    }

    public final String b(SocketMessage socketMessage, String str, IntRange range) {
        AbstractC5897pG0 abstractC5897pG0A = this.a.a(SocketMessage.class);
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter("***", "replacement");
        String strD = abstractC5897pG0A.d(socketMessage.copy(socketMessage.a, StringsKt.P(range.d, range.e + 1, str, "***").toString(), socketMessage.c, socketMessage.d, socketMessage.e, socketMessage.f, socketMessage.g));
        Intrinsics.checkNotNullExpressionValue(strD, "moshi.adapter(SocketMess…eRange(intRange, \"***\")))");
        return strD;
    }
}
