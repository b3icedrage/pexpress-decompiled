package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qh2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6197qh2 extends Zf2 {

    @NotNull
    public final C4718jg0 f;

    @NotNull
    public final C2006Sm g;

    @Nullable
    public Boolean h;

    @Nullable
    public String i;

    @Nullable
    public String j;

    @NotNull
    public final C4795k21 k;

    @NotNull
    public final N60 l;

    @NotNull
    public final N60 m;

    /* JADX INFO: renamed from: qh2$a */
    public static final class a implements InterfaceC6396rf0<List<? extends C5686oG>> {
        public final /* synthetic */ InterfaceC6396rf0 d;
        public final /* synthetic */ N60 e;

        /* JADX INFO: renamed from: qh2$a$a, reason: collision with other inner class name */
        public static final class C0477a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;
            public final /* synthetic */ N60 e;

            /* JADX INFO: renamed from: qh2$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.impl.core.backend.providers.WebSocketUrlProvider$fullServerList$$inlined$map$1$2", f = "WebSocketUrlProvider.kt", l = {219}, m = "emit")
            public static final class C0478a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0478a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0477a.this.a(null, this);
                }
            }

            public C0477a(InterfaceC6606sf0 interfaceC6606sf0, N60 n60) {
                this.d = interfaceC6606sf0;
                this.e = n60;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0478a c0478a;
                if (jm instanceof C0478a) {
                    c0478a = (C0478a) jm;
                    int i = c0478a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0478a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0478a = new C0478a(jm);
                    }
                } else {
                    c0478a = new C0478a(jm);
                }
                Object obj2 = c0478a.d;
                MN mn = MN.d;
                int i2 = c0478a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    List servers = (List) obj;
                    if (servers != null) {
                        b address = b.d;
                        N60 n60 = this.e;
                        n60.getClass();
                        Intrinsics.checkNotNullParameter(servers, "servers");
                        Intrinsics.checkNotNullParameter(address, "address");
                        long jLongValue = n60.a.invoke().longValue();
                        ConcurrentHashMap<String, Long> concurrentHashMap = n60.c;
                        Set<Map.Entry<String, Long>> setEntrySet = concurrentHashMap.entrySet();
                        final L60 l60 = new L60(jLongValue);
                        setEntrySet.removeIf(new Predicate() { // from class: M60
                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj3) {
                                return ((Boolean) l60.invoke(obj3)).booleanValue();
                            }
                        });
                        if (!concurrentHashMap.isEmpty()) {
                            ArrayList arrayList = new ArrayList();
                            for (T t : servers) {
                                if (!concurrentHashMap.containsKey(address.invoke(t))) {
                                    arrayList.add(t);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                servers = arrayList;
                            }
                        }
                    } else {
                        servers = null;
                    }
                    c0478a.e = 1;
                    if (this.d.a(servers, c0478a) == mn) {
                        return mn;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1795Pt1.b(obj2);
                }
                return Unit.a;
            }
        }

        public a(InterfaceC6396rf0 interfaceC6396rf0, N60 n60) {
            this.d = interfaceC6396rf0;
            this.e = n60;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super List<? extends C5686oG>> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new C0477a(interfaceC6606sf0, this.e), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    /* JADX INFO: renamed from: qh2$b */
    public static final class b implements Function1<C5686oG, String> {
        public static final b d = new b();

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(C5686oG c5686oG) {
            C5686oG server = c5686oG;
            Intrinsics.checkNotNullParameter(server, "server");
            return server.a;
        }
    }

    public C6197qh2() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6197qh2(C4923kf appDataRepository, AbstractC5328ma1 originProvider) {
        super(appDataRepository, originProvider);
        C5987ph2 now = C5987ph2.m;
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(originProvider, "originProvider");
        Intrinsics.checkNotNullParameter(now, "now");
        this.f = new C4718jg0(new C4733jk(appDataRepository.k, 3), new C7036uh2(2, null));
        this.g = new C2006Sm(appDataRepository.b, 1);
        this.k = ED.c();
        this.l = new N60(now);
        this.m = new N60(now);
    }

    @Override // defpackage.Zf2
    @NotNull
    public final InterfaceC6396rf0<List<C5686oG>> d() {
        Boolean bool = this.h;
        if (bool == null) {
            return super.d();
        }
        boolean zBooleanValue = bool.booleanValue();
        String.valueOf(zBooleanValue);
        return new a(zBooleanValue ? this.f : this.g, zBooleanValue ? this.l : this.m);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00a6 A[Catch: all -> 0x00a2, TRY_ENTER, TryCatch #0 {all -> 0x00a2, blocks: (B:45:0x00a6, B:49:0x00ac, B:51:0x00b2, B:30:0x0073, B:33:0x007b, B:35:0x0081), top: B:61:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b2 A[Catch: all -> 0x00a2, TRY_LEAVE, TryCatch #0 {all -> 0x00a2, blocks: (B:45:0x00a6, B:49:0x00ac, B:51:0x00b2, B:30:0x0073, B:33:0x007b, B:35:0x0081), top: B:61:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object f(boolean z, @NotNull LM lm) throws Throwable {
        C6406rh2 c6406rh2;
        InterfaceC4117h21 interfaceC4117h21;
        C6197qh2 c6197qh2;
        InterfaceC4117h21 interfaceC4117h22;
        C6197qh2 c6197qh3;
        InterfaceC4117h21 interfaceC4117h23;
        String str;
        Object objH;
        C6197qh2 c6197qh4;
        C6197qh2 c6197qh5;
        if (lm instanceof C6406rh2) {
            c6406rh2 = (C6406rh2) lm;
            int i = c6406rh2.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6406rh2.k = i - Integer.MIN_VALUE;
            } else {
                c6406rh2 = new C6406rh2(this, lm);
            }
        } else {
            c6406rh2 = new C6406rh2(this, lm);
        }
        Object obj = c6406rh2.i;
        MN mn = MN.d;
        int i2 = c6406rh2.k;
        String str2 = "";
        try {
            if (i2 == 0) {
                C1795Pt1.b(obj);
                c6406rh2.d = this;
                interfaceC4117h21 = this.k;
                c6406rh2.e = interfaceC4117h21;
                c6406rh2.h = z;
                c6406rh2.k = 1;
                if (interfaceC4117h21.a(c6406rh2) != mn) {
                    c6197qh2 = this;
                }
                return mn;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c6197qh5 = c6406rh2.g;
                    interfaceC4117h23 = c6406rh2.e;
                    c6197qh4 = c6406rh2.d;
                    try {
                        C1795Pt1.b(obj);
                        c6197qh5.j = (String) obj;
                        String str3 = c6197qh4.j;
                        interfaceC4117h21 = interfaceC4117h23;
                        interfaceC4117h23 = interfaceC4117h21;
                        Unit unit = Unit.a;
                        interfaceC4117h23.b(null);
                        return unit;
                    } catch (Throwable th) {
                        th = th;
                        interfaceC4117h23.b(null);
                        throw th;
                    }
                }
                z = c6406rh2.h;
                c6197qh2 = c6406rh2.g;
                interfaceC4117h22 = c6406rh2.e;
                c6197qh3 = c6406rh2.d;
                try {
                    C1795Pt1.b(obj);
                    c6197qh2.i = (String) obj;
                    String str4 = c6197qh3.j;
                    interfaceC4117h21 = interfaceC4117h22;
                    c6197qh2 = c6197qh3;
                    if (z) {
                        str = c6197qh2.j;
                        if (str != null) {
                            str2 = str;
                        }
                        if (StringsKt.I(str2)) {
                            c6406rh2.d = c6197qh2;
                            c6406rh2.e = interfaceC4117h21;
                            c6406rh2.g = c6197qh2;
                            c6406rh2.k = 3;
                            objH = c6197qh2.h(true, c6406rh2);
                            if (objH != mn) {
                                interfaceC4117h23 = interfaceC4117h21;
                                c6197qh4 = c6197qh2;
                                obj = objH;
                                c6197qh5 = c6197qh4;
                                c6197qh5.j = (String) obj;
                                String str5 = c6197qh4.j;
                                interfaceC4117h21 = interfaceC4117h23;
                            }
                            return mn;
                        }
                    }
                    interfaceC4117h23 = interfaceC4117h21;
                    Unit unit2 = Unit.a;
                    interfaceC4117h23.b(null);
                    return unit2;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC4117h23 = interfaceC4117h22;
                    interfaceC4117h23.b(null);
                    throw th;
                }
            }
            z = c6406rh2.h;
            InterfaceC4117h21 interfaceC4117h24 = c6406rh2.e;
            C6197qh2 c6197qh6 = c6406rh2.d;
            C1795Pt1.b(obj);
            interfaceC4117h21 = interfaceC4117h24;
            c6197qh2 = c6197qh6;
            c6197qh2.getClass();
            String str6 = c6197qh2.i;
            if (str6 == null) {
                str6 = "";
            }
            if (!StringsKt.I(str6)) {
                if (z) {
                    str = c6197qh2.j;
                    if (str != null) {
                        str2 = str;
                    }
                    if (StringsKt.I(str2)) {
                        c6406rh2.d = c6197qh2;
                        c6406rh2.e = interfaceC4117h21;
                        c6406rh2.g = c6197qh2;
                        c6406rh2.k = 3;
                        objH = c6197qh2.h(true, c6406rh2);
                        if (objH != mn) {
                            interfaceC4117h23 = interfaceC4117h21;
                            c6197qh4 = c6197qh2;
                            obj = objH;
                            c6197qh5 = c6197qh4;
                            c6197qh5.j = (String) obj;
                            String str7 = c6197qh4.j;
                            interfaceC4117h21 = interfaceC4117h23;
                        }
                    }
                }
                interfaceC4117h23 = interfaceC4117h21;
                Unit unit3 = Unit.a;
                interfaceC4117h23.b(null);
                return unit3;
            }
            c6406rh2.d = c6197qh2;
            c6406rh2.e = interfaceC4117h21;
            c6406rh2.g = c6197qh2;
            c6406rh2.h = z;
            c6406rh2.k = 2;
            Object objH2 = c6197qh2.h(false, c6406rh2);
            if (objH2 != mn) {
                interfaceC4117h22 = interfaceC4117h21;
                obj = objH2;
                c6197qh3 = c6197qh2;
                c6197qh2.i = (String) obj;
                String str8 = c6197qh3.j;
                interfaceC4117h21 = interfaceC4117h22;
                c6197qh2 = c6197qh3;
                if (z) {
                    str = c6197qh2.j;
                    if (str != null) {
                        str2 = str;
                    }
                    if (StringsKt.I(str2)) {
                        c6406rh2.d = c6197qh2;
                        c6406rh2.e = interfaceC4117h21;
                        c6406rh2.g = c6197qh2;
                        c6406rh2.k = 3;
                        objH = c6197qh2.h(true, c6406rh2);
                        if (objH != mn) {
                            interfaceC4117h23 = interfaceC4117h21;
                            c6197qh4 = c6197qh2;
                            obj = objH;
                            c6197qh5 = c6197qh4;
                            c6197qh5.j = (String) obj;
                            String str9 = c6197qh4.j;
                            interfaceC4117h21 = interfaceC4117h23;
                        }
                    }
                }
                interfaceC4117h23 = interfaceC4117h21;
                Unit unit4 = Unit.a;
                interfaceC4117h23.b(null);
                return unit4;
            }
            return mn;
        } catch (Throwable th3) {
            th = th3;
            interfaceC4117h23 = interfaceC4117h21;
            interfaceC4117h23.b(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object g(@NotNull LM lm, @NotNull String url, boolean z) {
        C6616sh2 c6616sh2;
        C4795k21 c4795k21;
        C6197qh2 c6197qh2;
        if (lm instanceof C6616sh2) {
            c6616sh2 = (C6616sh2) lm;
            int i = c6616sh2.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6616sh2.k = i - Integer.MIN_VALUE;
            } else {
                c6616sh2 = new C6616sh2(this, lm);
            }
        } else {
            c6616sh2 = new C6616sh2(this, lm);
        }
        Object obj = c6616sh2.i;
        MN mn = MN.d;
        int i2 = c6616sh2.k;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            c6616sh2.d = this;
            c6616sh2.e = url;
            c4795k21 = this.k;
            c6616sh2.g = c4795k21;
            c6616sh2.h = z;
            c6616sh2.k = 1;
            if (c4795k21.a(c6616sh2) == mn) {
                return mn;
            }
            c6197qh2 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = c6616sh2.h;
            C4795k21 c4795k22 = c6616sh2.g;
            String str = c6616sh2.e;
            c6197qh2 = c6616sh2.d;
            C1795Pt1.b(obj);
            c4795k21 = c4795k22;
            url = str;
        }
        try {
            if (z) {
                N60 n60 = c6197qh2.l;
                n60.getClass();
                Intrinsics.checkNotNullParameter(url, "url");
                n60.c.put(url, Long.valueOf(n60.a.invoke().longValue() + n60.b));
                if (Intrinsics.a(c6197qh2.j, url)) {
                    c6197qh2.j = null;
                }
            } else {
                N60 n61 = c6197qh2.m;
                n61.getClass();
                Intrinsics.checkNotNullParameter(url, "url");
                n61.c.put(url, Long.valueOf(n61.a.invoke().longValue() + n61.b));
                if (Intrinsics.a(c6197qh2.i, url)) {
                    c6197qh2.i = null;
                }
            }
            Unit unit = Unit.a;
            c4795k21.b(null);
            return unit;
        } catch (Throwable th) {
            c4795k21.b(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(boolean z, LM lm) {
        C6826th2 c6826th2;
        C6197qh2 c6197qh2;
        if (lm instanceof C6826th2) {
            c6826th2 = (C6826th2) lm;
            int i = c6826th2.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6826th2.h = i - Integer.MIN_VALUE;
            } else {
                c6826th2 = new C6826th2(this, lm);
            }
        } else {
            c6826th2 = new C6826th2(this, lm);
        }
        Object obj = c6826th2.e;
        MN mn = MN.d;
        int i2 = c6826th2.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            this.h = Boolean.valueOf(z);
            this.e = null;
            c6826th2.d = this;
            c6826th2.h = 1;
            if (Zf2.e(this, c6826th2) == mn) {
                return mn;
            }
            c6197qh2 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c6197qh2 = c6826th2.d;
            C1795Pt1.b(obj);
        }
        return c6197qh2.b();
    }
}
