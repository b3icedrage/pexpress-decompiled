package defpackage;

import androidx.core.app.FrameMetricsAggregator;
import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import io.sentry.android.core.AnrV2Integration;
import io.sentry.android.core.cache.a;
import io.sentry.util.l;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Pc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1742Pc implements InterfaceC1608Nj0, l.a, a.C0380a.InterfaceC0381a {
    public final /* synthetic */ int d;

    public /* synthetic */ C1742Pc(int i) {
        this.d = i;
    }

    public static Object c(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String d(char c, String str, String str2) {
        return str + str2 + c;
    }

    public static void e(QZ1 qz1, W31 w31, W31 w32) {
        w31.i(qz1.a());
        X31.c(w32);
    }

    public static boolean f(C2061Te0.a aVar, int i, String str) {
        Boolean boolC = aVar.c(i);
        Intrinsics.checkNotNullExpressionValue(boolC, str);
        return boolC.booleanValue();
    }

    @Override // io.sentry.android.core.cache.a.C0380a.InterfaceC0381a
    public Long a(Object obj) {
        return Long.valueOf(((AnrV2Integration.a) obj).d);
    }

    @Override // defpackage.InterfaceC1608Nj0
    public Object apply(Object obj) {
        long j;
        switch (this.d) {
            case 4:
                String strB = ((AbstractC7844yZ0) obj).b();
                byte[] bArr = C6806tc2.a;
                Intrinsics.checkNotNullParameter(strB, "<this>");
                try {
                    j = Long.parseLong(strB);
                    break;
                } catch (NumberFormatException unused) {
                    j = 0;
                }
                return Boolean.valueOf(j < 0);
            default:
                SocketMessage socketMessage = ((D92) obj).a;
                return DS1.c("{type = " + socketMessage.a + ", id = " + socketMessage.c + ", data = " + socketMessage.b);
        }
    }

    @Override // io.sentry.util.l.a
    public Object b() {
        return new FrameMetricsAggregator();
    }
}
