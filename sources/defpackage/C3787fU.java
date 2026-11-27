package defpackage;

import androidx.annotation.NonNull;
import io.jsonwebtoken.JwtParser;
import io.sentry.transport.b;
import io.sentry.transport.e;
import io.sentry.transport.l;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3787fU implements InterfaceC4770jv0, InterfaceC6867tt1, J71, InterfaceC2953bV0 {

    @NotNull
    public static final GW1 d = new GW1("COMPLETING_ALREADY");

    @NotNull
    public static final GW1 e = new GW1("COMPLETING_WAITING_CHILDREN");

    @NotNull
    public static final GW1 g = new GW1("COMPLETING_RETRY");

    @NotNull
    public static final GW1 h = new GW1("TOO_LATE_TO_CANCEL");

    @NotNull
    public static final GW1 i = new GW1("SEALED");

    @NotNull
    public static final C3083c60 j = new C3083c60(false);

    @NotNull
    public static final C3083c60 k = new C3083c60(true);
    public static final C3787fU l = new C3787fU();

    @NotNull
    public static final C3787fU m = new C3787fU();

    @NotNull
    public static String[] d(@NotNull String... signatures) {
        Intrinsics.checkNotNullParameter(signatures, "signatures");
        ArrayList arrayList = new ArrayList(signatures.length);
        for (String str : signatures) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @NotNull
    public static final String f(@NotNull Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @NotNull
    public static LinkedHashSet g(@NotNull String internalName, @NotNull String... signatures) {
        Intrinsics.checkNotNullParameter(internalName, "internalName");
        Intrinsics.checkNotNullParameter(signatures, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : signatures) {
            linkedHashSet.add(internalName + JwtParser.SEPARATOR_CHAR + str);
        }
        return linkedHashSet;
    }

    @NotNull
    public static LinkedHashSet h(@NotNull String name, @NotNull String... signatures) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signatures, "signatures");
        return g(k(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    @NotNull
    public static LinkedHashSet i(@NotNull String name, @NotNull String... signatures) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signatures, "signatures");
        return g(l(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    @NotNull
    public static String j(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return "java/util/function/".concat(name);
    }

    @NotNull
    public static String k(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return "java/lang/" + name;
    }

    @NotNull
    public static String l(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return "java/util/".concat(name);
    }

    public static final void m(int i2, int i3, @NotNull C6188qf1 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ArrayList missingFields = new ArrayList();
        int i4 = (~i2) & i3;
        for (int i5 = 0; i5 < 32; i5++) {
            if ((i4 & 1) != 0) {
                missingFields.add(descriptor.e[i5]);
            }
            i4 >>>= 1;
        }
        String serialName = descriptor.a;
        Intrinsics.checkNotNullParameter(missingFields, "missingFields");
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        throw new B01(missingFields, missingFields.size() == 1 ? "Field '" + ((String) missingFields.get(0)) + "' is required for type with serial name '" + serialName + "', but it was missing" : "Fields " + missingFields + " are required for type with serial name '" + serialName + "', but they were missing", null);
    }

    @NotNull
    public static final String n(@NotNull JM jm) {
        Object objA;
        if (jm instanceof C5004l20) {
            return jm.toString();
        }
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            objA = jm + '@' + f(jm);
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
        if (C1717Ot1.a(objA) != null) {
            objA = jm.getClass().getName() + '@' + f(jm);
        }
        return (String) objA;
    }

    @Nullable
    public static final Object o(@Nullable Object obj) {
        InterfaceC7719xx0 interfaceC7719xx0;
        C0634Ax0 c0634Ax0 = obj instanceof C0634Ax0 ? (C0634Ax0) obj : null;
        return (c0634Ax0 == null || (interfaceC7719xx0 = c0634Ax0.a) == null) ? obj : interfaceC7719xx0;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    @Override // defpackage.InterfaceC6867tt1
    public InterfaceC3667et1 a(@NonNull InterfaceC3667et1 interfaceC3667et1, @NonNull C4227ha1 c4227ha1) {
        byte[] bArrArray;
        ByteBuffer byteBufferAsReadOnlyBuffer = ((C0988Fl0) interfaceC3667et1.get()).d.a.a.d.asReadOnlyBuffer();
        AtomicReference<byte[]> atomicReference = C6035pw.a;
        C6035pw.b bVar = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new C6035pw.b(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
        if (bVar == null || bVar.a != 0) {
            ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
            byteBufferAsReadOnlyBuffer2.get(bArr);
            bArrArray = bArr;
        } else {
            if (bVar.b == bVar.c.length) {
                bArrArray = byteBufferAsReadOnlyBuffer.array();
            } else {
                ByteBuffer byteBufferAsReadOnlyBuffer3 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
                byte[] bArr2 = new byte[byteBufferAsReadOnlyBuffer3.limit()];
                byteBufferAsReadOnlyBuffer3.get(bArr2);
                bArrArray = bArr2;
            }
        }
        return new C2036Sw(bArrArray);
    }

    @Override // defpackage.InterfaceC4770jv0
    @NotNull
    public e b(@NotNull C2688aH1 c2688aH1, @NotNull C7705xs1 c7705xs1) {
        return new b(c2688aH1, new l(c2688aH1), c2688aH1.getTransportGate(), c7705xs1);
    }

    @Override // defpackage.InterfaceC2953bV0
    public Map c() {
        return null;
    }

    @Override // defpackage.J71
    public Object e() {
        return new LinkedHashSet();
    }
}
