package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import android.webkit.URLUtil;
import io.sentry.util.B;
import io.sentry.util.v;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Xo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2432Xo implements InterfaceC3529eE, InterfaceC5765oe2, InterfaceC3646em2 {
    public static LO0 f(LO0 lo0, WC containingDeclaration, InterfaceC2902bE0 interfaceC2902bE0, int i) {
        if ((i & 2) != 0) {
            interfaceC2902bE0 = null;
        }
        Intrinsics.checkNotNullParameter(lo0, "<this>");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        return new LO0(lo0.a, interfaceC2902bE0 != null ? new WO0(lo0, containingDeclaration, interfaceC2902bE0, 0) : lo0.b, XO0.a(EnumC4403iP0.e, new C7804yM(0, lo0, containingDeclaration)));
    }

    @NotNull
    public static final LO0 g(@NotNull LO0 lo0, @NotNull InterfaceC2396Xc additionalAnnotations) {
        Intrinsics.checkNotNullParameter(lo0, "<this>");
        Intrinsics.checkNotNullParameter(additionalAnnotations, "additionalAnnotations");
        if (additionalAnnotations.isEmpty()) {
            return lo0;
        }
        return new LO0(lo0.a, lo0.b, XO0.a(EnumC4403iP0.e, new C8014zM(lo0, additionalAnnotations)));
    }

    public static String h() {
        byte[] bArr = new byte[16];
        v.a().b(bArr);
        byte b = (byte) (bArr[6] & 15);
        bArr[6] = b;
        bArr[6] = (byte) (b | 64);
        byte b2 = (byte) (bArr[8] & 63);
        bArr[8] = b2;
        bArr[8] = (byte) (b2 | 128);
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < 8; i++) {
            j2 = (j2 << 8) | ((long) (bArr[i] & 255));
        }
        for (int i2 = 8; i2 < 16; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        UUID uuid = new UUID(j2, j);
        char[] cArr = B.a;
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        char[] cArr2 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, cArr[(int) (((-1152921504606846976L) & leastSignificantBits) >>> 60)], cArr[(int) ((1080863910568919040L & leastSignificantBits) >>> 56)], cArr[(int) ((67553994410557440L & leastSignificantBits) >>> 52)], cArr[(int) ((4222124650659840L & leastSignificantBits) >>> 48)], cArr[(int) ((263882790666240L & leastSignificantBits) >>> 44)], cArr[(int) ((16492674416640L & leastSignificantBits) >>> 40)], cArr[(int) ((1030792151040L & leastSignificantBits) >>> 36)], cArr[(int) ((64424509440L & leastSignificantBits) >>> 32)], cArr[(int) ((4026531840L & leastSignificantBits) >>> 28)], cArr[(int) ((251658240 & leastSignificantBits) >>> 24)], cArr[(int) ((15728640 & leastSignificantBits) >>> 20)], cArr[(int) ((983040 & leastSignificantBits) >>> 16)], cArr[(int) ((61440 & leastSignificantBits) >>> 12)], cArr[(int) ((3840 & leastSignificantBits) >>> 8)], cArr[(int) ((240 & leastSignificantBits) >>> 4)], cArr[(int) (15 & leastSignificantBits)]};
        B.a(cArr2, mostSignificantBits);
        char[] cArr3 = B.a;
        return new String(cArr2);
    }

    public static final boolean j(@NotNull String str) {
        String host;
        Intrinsics.checkNotNullParameter(str, "<this>");
        return URLUtil.isHttpsUrl(str) && (host = Uri.parse(str).getHost()) != null && (d.h(host, "jivosite.com", false) || d.h(host, "jivo.ru", false));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object k(@NotNull List list, @NotNull LM lm) {
        C2328Wo c2328Wo;
        Iterator it;
        if (lm instanceof C2328Wo) {
            c2328Wo = (C2328Wo) lm;
            int i = c2328Wo.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2328Wo.g = i - Integer.MIN_VALUE;
            } else {
                c2328Wo = new C2328Wo(lm);
            }
        } else {
            c2328Wo = new C2328Wo(lm);
        }
        Object obj = c2328Wo.e;
        MN mn = MN.d;
        int i2 = c2328Wo.g;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            it = list.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = c2328Wo.d;
            C1795Pt1.b(obj);
        }
        while (it.hasNext()) {
            XF0 xf0 = (XF0) it.next();
            c2328Wo.d = it;
            c2328Wo.g = 1;
            if (xf0.b1(c2328Wo) == mn) {
                return mn;
            }
        }
        return Unit.a;
    }

    @Override // defpackage.InterfaceC4276hm2
    public /* synthetic */ Object a() {
        return new C7266vm2("IntegrityService");
    }

    @Override // defpackage.InterfaceC3529eE
    public long d() {
        return SystemClock.elapsedRealtime();
    }

    @NotNull
    public C1821Qc0 i(@NotNull C1563Mv0 configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new C1821Qc0(configuration);
    }

    @Override // defpackage.InterfaceC5765oe2
    public void c() {
    }

    @Override // defpackage.InterfaceC5765oe2
    public void e() {
    }
}
