package defpackage;

import io.jsonwebtoken.JwtParser;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: aM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2701aM {

    @NotNull
    public static final b c = new b();

    @NotNull
    public static final C2498Yk<C2701aM> d = new C2498Yk<>("ContentNegotiation");

    @NotNull
    public final ArrayList a;

    @NotNull
    public final LinkedHashSet b;

    /* JADX INFO: renamed from: aM$a */
    public static final class a {

        @NotNull
        public final LinkedHashSet a = CollectionsKt.g0(C5907pJ1.d(C6570sV.a, C4183hM.b));

        @NotNull
        public final ArrayList b = new ArrayList();

        /* JADX INFO: renamed from: aM$a$a, reason: collision with other inner class name */
        public static final class C0214a {

            @NotNull
            public final AL0 a;

            @NotNull
            public final C4651jM b;

            @NotNull
            public final InterfaceC4861kM c;

            public C0214a(@NotNull AL0 converter, @NotNull C4651jM contentTypeToSend, @NotNull InterfaceC4861kM contentTypeMatcher) {
                Intrinsics.checkNotNullParameter(converter, "converter");
                Intrinsics.checkNotNullParameter(contentTypeToSend, "contentTypeToSend");
                Intrinsics.checkNotNullParameter(contentTypeMatcher, "contentTypeMatcher");
                this.a = converter;
                this.b = contentTypeToSend;
                this.c = contentTypeMatcher;
            }
        }
    }

    /* JADX INFO: renamed from: aM$b */
    public static final class b implements InterfaceC4755jq0<a, C2701aM> {
        @Override // defpackage.InterfaceC4755jq0
        public final void a(C2701aM c2701aM, C1782Pp0 scope) {
            C2701aM plugin = c2701aM;
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            scope.i.f(C4539ir0.h, new C3134cM(plugin, null));
            scope.j.f(C6440rr0.h, new C3344dM(plugin, null));
        }

        @Override // defpackage.InterfaceC4755jq0
        public final C2701aM b(Function1<? super a, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            a aVar = new a();
            block.invoke(aVar);
            return new C2701aM(aVar.b, aVar.a);
        }

        @Override // defpackage.InterfaceC4755jq0
        @NotNull
        public final C2498Yk<C2701aM> getKey() {
            return C2701aM.d;
        }
    }

    public C2701aM(@NotNull ArrayList registrations, @NotNull LinkedHashSet ignoredTypes) {
        Intrinsics.checkNotNullParameter(registrations, "registrations");
        Intrinsics.checkNotNullParameter(ignoredTypes, "ignoredTypes");
        this.a = registrations;
        this.b = ignoredTypes;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:75:0x0203 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x0204  */
    /* JADX WARN: Code duplicated, block: B:79:0x020c  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x022d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0230  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0204 -> B:77:0x0208). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull defpackage.C3032br0 r17, @org.jetbrains.annotations.NotNull java.lang.Object r18, @org.jetbrains.annotations.NotNull defpackage.LM r19) {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2701aM.a(br0, java.lang.Object, LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object b(@NotNull La2 la2, @NotNull A62 a62, @NotNull Object obj, @NotNull C4651jM c4651jM, @NotNull Charset charset, @NotNull LM lm) {
        C3973gM c3973gM;
        if (lm instanceof C3973gM) {
            c3973gM = (C3973gM) lm;
            int i = c3973gM.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3973gM.h = i - Integer.MIN_VALUE;
            } else {
                c3973gM = new C3973gM(this, lm);
            }
        } else {
            c3973gM = new C3973gM(this, lm);
        }
        Object objG = c3973gM.e;
        MN mn = MN.d;
        int i2 = c3973gM.h;
        if (i2 == 0) {
            C1795Pt1.b(objG);
            if (!(obj instanceof InterfaceC0942Ew)) {
                C4183hM.a.c("Response body is already transformed. Skipping ContentNegotiation for " + la2 + JwtParser.SEPARATOR_CHAR);
                return null;
            }
            if (this.b.contains(a62.a)) {
                C4183hM.a.c("Response body type " + a62.a + " is in ignored types. Skipping ContentNegotiation for " + la2 + JwtParser.SEPARATOR_CHAR);
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : this.a) {
                if (((a.C0214a) obj2).c.a(c4651jM)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(XE.m(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((a.C0214a) it.next()).a);
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            if (arrayList2 == null) {
                C4183hM.a.c("None of the registered converters match response with Content-Type=" + c4651jM + ". Skipping ContentNegotiation for " + la2 + JwtParser.SEPARATOR_CHAR);
                return null;
            }
            c3973gM.d = la2;
            c3973gM.h = 1;
            objG = LL.g(arrayList2, (InterfaceC0942Ew) obj, a62, charset, c3973gM);
            if (objG == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            la2 = c3973gM.d;
            C1795Pt1.b(objG);
        }
        if (!(objG instanceof InterfaceC0942Ew)) {
            C4183hM.a.c("Response body was converted to " + C2017Sp1.a.b(objG.getClass()) + " for " + la2 + JwtParser.SEPARATOR_CHAR);
        }
        return objG;
    }
}
