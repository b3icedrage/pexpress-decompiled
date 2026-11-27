package defpackage;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: s8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6499s8 {

    @NotNull
    public static final Regex c = new Regex("(?<!\\d)[45]\\d{2}(?!\\d)");
    public final boolean a;

    @NotNull
    public final ConcurrentHashMap<EnumC6919u8, a> b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: s8$a */
    public static final class a {

        @NotNull
        public final AtomicInteger a = new AtomicInteger();

        @NotNull
        public final AtomicInteger b = new AtomicInteger();

        @NotNull
        public final AtomicInteger c = new AtomicInteger();

        @NotNull
        public final AtomicBoolean d = new AtomicBoolean();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: s8$b */
    public static final class b {
        public static final b d;
        public static final b e;
        public static final b g;
        public static final /* synthetic */ b[] h;

        static {
            b bVar = new b("HARD", 0);
            d = bVar;
            b bVar2 = new b("TRANSIENT", 1);
            e = bVar2;
            b bVar3 = new b("IGNORED", 2);
            g = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            h = bVarArr;
            C1952Ru.i(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) h.clone();
        }
    }

    public C6499s8(boolean z) {
        this.a = z;
    }

    @NotNull
    public final C6709t8 a(@NotNull EnumC6919u8 kind, @Nullable Integer num, @Nullable String str, @Nullable String str2) {
        b bVar;
        String string;
        String string2;
        C6367rX0 c6367rX0B;
        String value;
        a aVarPutIfAbsent;
        Intrinsics.checkNotNullParameter(kind, "kind");
        ConcurrentHashMap<EnumC6919u8, a> concurrentHashMap = this.b;
        a aVar = concurrentHashMap.get(kind);
        if (aVar == null && (aVarPutIfAbsent = concurrentHashMap.putIfAbsent(kind, (aVar = new a()))) != null) {
            aVar = aVarPutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(aVar, "getOrPut(...)");
        a aVar2 = aVar;
        Integer numValueOf = (str == null || (c6367rX0B = Regex.b(c, str)) == null || (value = c6367rX0B.getValue()) == null) ? null : Integer.valueOf(Integer.parseInt(value));
        if ((num != null && num.intValue() == 10) || (num != null && num.intValue() == 40)) {
            bVar = b.e;
        } else if (num != null && num.intValue() == 11) {
            bVar = b.g;
        } else {
            bVar = (num == null && numValueOf == null) ? b.e : b.d;
        }
        int iOrdinal = bVar.ordinal();
        AtomicInteger atomicInteger = aVar2.b;
        AtomicInteger atomicInteger2 = aVar2.c;
        if (iOrdinal == 0) {
            atomicInteger.incrementAndGet();
        } else if (iOrdinal == 1) {
            atomicInteger2.incrementAndGet();
        } else if (iOrdinal != 2) {
            throw new C6489s51();
        }
        String str3 = DevicePublicKeyStringDef.NONE;
        if (num == null || (string = num.toString()) == null) {
            string = DevicePublicKeyStringDef.NONE;
        }
        if (numValueOf != null && (string2 = numValueOf.toString()) != null) {
            str3 = string2;
        }
        Map mapE = PW0.e(new Pair("success_count", Integer.valueOf(aVar2.a.get())), new Pair("hard_failure_count", Integer.valueOf(atomicInteger.get())), new Pair("transient_failure_count", Integer.valueOf(atomicInteger2.get())));
        String str4 = kind.d;
        String strD = C1039Gc0.d("af.", str4, ".failed");
        b bVar2 = b.d;
        boolean z = bVar == bVar2;
        C5315mW0 builder = new C5315mW0();
        builder.put("code", string);
        builder.put("http_status", str3);
        Integer num2 = numValueOf;
        builder.put("transient", Boolean.valueOf(bVar == b.e));
        if (str2 != null) {
            builder.put("event", str2);
        }
        builder.putAll(mapE);
        Unit unit = Unit.a;
        Intrinsics.checkNotNullParameter(builder, "builder");
        C6080q8 c6080q8 = new C6080q8(builder.c(), strD, z);
        if (bVar != bVar2 || !this.a || !aVar2.d.compareAndSet(false, true)) {
            return new C6709t8(c6080q8, null);
        }
        StringBuilder sbA = C5896pG.a("AppsFlyer ", str4, " failed: code=", string, " http=");
        sbA.append(str3);
        String string3 = sbA.toString();
        List listF = WE.f("af-request-failed", str4, string, str3);
        C5315mW0 builder2 = new C5315mW0();
        builder2.put("af.kind", str4);
        builder2.put("af.code", string);
        if (num2 != null) {
        }
        if (str2 != null) {
            builder2.put("af.event", str2);
        }
        Intrinsics.checkNotNullParameter(builder2, "builder");
        C5315mW0 c5315mW0C = builder2.c();
        C5315mW0 builder3 = new C5315mW0();
        if (str != null) {
            builder3.put("af.desc", KS1.B(HttpPlatformResponse.MAX_MESSAGE_LENGTH, str));
        }
        for (Map.Entry entry : mapE.entrySet()) {
            builder3.put(C5491nL.c("af.", (String) entry.getKey()), Integer.valueOf(((Number) entry.getValue()).intValue()));
        }
        Unit unit2 = Unit.a;
        Intrinsics.checkNotNullParameter(builder3, "builder");
        return new C6709t8(c6080q8, new C6289r8(string3, listF, c5315mW0C, builder3.c()));
    }

    @NotNull
    public final C6080q8 b(@NotNull EnumC6919u8 kind) {
        a aVarPutIfAbsent;
        Intrinsics.checkNotNullParameter(kind, "kind");
        ConcurrentHashMap<EnumC6919u8, a> concurrentHashMap = this.b;
        a aVar = concurrentHashMap.get(kind);
        if (aVar == null && (aVarPutIfAbsent = concurrentHashMap.putIfAbsent(kind, (aVar = new a()))) != null) {
            aVar = aVarPutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(aVar, "getOrPut(...)");
        return new C6080q8(OW0.b(new Pair("success_count", Integer.valueOf(aVar.a.incrementAndGet()))), C1039Gc0.d("af.", kind.d, ".ok"), false);
    }
}
