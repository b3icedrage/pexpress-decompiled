package defpackage;

import com.jivosite.sdk.model.pojo.CustomData;
import com.jivosite.sdk.support.builders.ContactInfo;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class XA implements InterfaceC7325w41, WA {

    @NotNull
    public final TA a;

    @NotNull
    public final IV1 b;

    @NotNull
    public final Set<ZI1<?>> c;

    @NotNull
    public final AbstractC5251mB d;

    @NotNull
    public final C4923kf e;

    @NotNull
    public final b f;

    @NotNull
    public final c g;

    @InterfaceC3368dU(c = "com.base.feature.support.chat.ChatInitializerBase$forceSendClientInfo$1", f = "ChatInitializerBase.kt", l = {94, 95}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return XA.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        
            if (defpackage.XA.d(r2, (com.jivosite.sdk.support.builders.ContactInfo) r6, r5) == r0) goto L15;
         */
        @Override // defpackage.AbstractC7487wq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                MN r0 = defpackage.MN.d
                int r1 = r5.d
                XA r2 = defpackage.XA.this
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1e
                if (r1 == r4) goto L1a
                if (r1 != r3) goto L12
                defpackage.C1795Pt1.b(r6)
                goto L37
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                defpackage.C1795Pt1.b(r6)
                goto L2c
            L1e:
                defpackage.C1795Pt1.b(r6)
                XA$b r6 = r2.f
                r5.d = r4
                java.lang.Object r6 = defpackage.C4466ii.o(r6, r5)
                if (r6 != r0) goto L2c
                goto L36
            L2c:
                com.jivosite.sdk.support.builders.ContactInfo r6 = (com.jivosite.sdk.support.builders.ContactInfo) r6
                r5.d = r3
                java.lang.Object r6 = defpackage.XA.d(r2, r6, r5)
                if (r6 != r0) goto L37
            L36:
                return r0
            L37:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: XA.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b implements InterfaceC6396rf0<ContactInfo> {
        public final /* synthetic */ InterfaceC6396rf0 d;

        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: XA$b$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.support.chat.ChatInitializerBase$special$$inlined$filter$1$2", f = "ChatInitializerBase.kt", l = {219}, m = "emit")
            public static final class C0185a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0185a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return a.this.a(null, this);
                }
            }

            public a(InterfaceC6606sf0 interfaceC6606sf0) {
                this.d = interfaceC6606sf0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0185a c0185a;
                if (jm instanceof C0185a) {
                    c0185a = (C0185a) jm;
                    int i = c0185a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0185a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0185a = new C0185a(jm);
                    }
                } else {
                    c0185a = new C0185a(jm);
                }
                Object obj2 = c0185a.d;
                MN mn = MN.d;
                int i2 = c0185a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    String str = ((ContactInfo) obj).a;
                    if (str != null && str.length() != 0) {
                        c0185a.e = 1;
                        if (this.d.a(obj, c0185a) == mn) {
                            return mn;
                        }
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

        public b(InterfaceC6396rf0 interfaceC6396rf0) {
            this.d = interfaceC6396rf0;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super ContactInfo> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public static final class c implements InterfaceC6396rf0<List<? extends CustomData>> {
        public final /* synthetic */ InterfaceC6396rf0 d;

        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: XA$c$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.support.chat.ChatInitializerBase$special$$inlined$filter$2$2", f = "ChatInitializerBase.kt", l = {219}, m = "emit")
            public static final class C0186a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0186a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return a.this.a(null, this);
                }
            }

            public a(InterfaceC6606sf0 interfaceC6606sf0) {
                this.d = interfaceC6606sf0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0186a c0186a;
                if (jm instanceof C0186a) {
                    c0186a = (C0186a) jm;
                    int i = c0186a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0186a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0186a = new C0186a(jm);
                    }
                } else {
                    c0186a = new C0186a(jm);
                }
                Object obj2 = c0186a.d;
                MN mn = MN.d;
                int i2 = c0186a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    if (!((List) obj).isEmpty()) {
                        c0186a.e = 1;
                        if (this.d.a(obj, c0186a) == mn) {
                            return mn;
                        }
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

        public c(InterfaceC6396rf0 interfaceC6396rf0) {
            this.d = interfaceC6396rf0;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super List<? extends CustomData>> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.base.feature.support.chat.ChatInitializerBase$subscribeOnUpdates$1$1", f = "ChatInitializerBase.kt", l = {58}, m = "invokeSuspend")
    public static final class d extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ ZI1<?> e;
        public final /* synthetic */ XA g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ZI1<?> zi1, XA xa, JM<? super d> jm) {
            super(2, jm);
            this.e = zi1;
            this.g = xa;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new d(this.e, this.g, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((d) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                ZI1<?> zi1 = this.e;
                C2017Sp1.a.b(zi1.getClass()).f();
                TA ta = this.g.a;
                this.d = 1;
                if (zi1.a(ta, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.base.feature.support.chat.ChatInitializerBase$subscribeOnUpdates$2", f = "ChatInitializerBase.kt", l = {62}, m = "invokeSuspend")
    public static final class e extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ XA d;

            public a(XA xa) {
                this.d = xa;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                Object objD = XA.d(this.d, (ContactInfo) obj, jm);
                return objD == MN.d ? objD : Unit.a;
            }
        }

        public e(JM<? super e> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return XA.this.new e(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((e) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                XA xa = XA.this;
                b bVar = xa.f;
                a aVar = new a(xa);
                this.d = 1;
                if (bVar.c(aVar, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.base.feature.support.chat.ChatInitializerBase$subscribeOnUpdates$3", f = "ChatInitializerBase.kt", l = {67}, m = "invokeSuspend")
    public static final class f extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ XA d;

            public a(XA xa) {
                this.d = xa;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                Object objE = XA.e(this.d, (List) obj, jm);
                return objE == MN.d ? objE : Unit.a;
            }
        }

        public f(JM<? super f> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return XA.this.new f(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((f) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                XA xa = XA.this;
                c cVar = xa.g;
                a aVar = new a(xa);
                this.d = 1;
                if (cVar.c(aVar, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.base.feature.support.chat.ChatInitializerBase$subscribeOnUpdates$4", f = "ChatInitializerBase.kt", l = {72}, m = "invokeSuspend")
    public static final class g extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ XA d;

            /* JADX INFO: renamed from: XA$g$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.support.chat.ChatInitializerBase$subscribeOnUpdates$4$2$1$1", f = "ChatInitializerBase.kt", l = {}, m = "invokeSuspend")
            public static final class C0187a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
                public final /* synthetic */ String d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0187a(String str, JM<? super C0187a> jm) {
                    super(2, jm);
                    this.d = str;
                }

                @Override // defpackage.AbstractC7487wq
                public final JM<Unit> create(Object obj, JM<?> jm) {
                    return new C0187a(this.d, jm);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(KN kn, JM<? super Unit> jm) {
                    return ((C0187a) create(kn, jm)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.AbstractC7487wq
                public final Object invokeSuspend(Object obj) {
                    MN mn = MN.d;
                    C1795Pt1.b(obj);
                    C6104qF0.g(this.d);
                    return Unit.a;
                }
            }

            @InterfaceC3368dU(c = "com.base.feature.support.chat.ChatInitializerBase$subscribeOnUpdates$4$2$2", f = "ChatInitializerBase.kt", l = {}, m = "invokeSuspend")
            public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
                public b() {
                    throw null;
                }

                @Override // defpackage.AbstractC7487wq
                public final JM<Unit> create(Object obj, JM<?> jm) {
                    return new b(2, jm);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(KN kn, JM<? super Unit> jm) {
                    return ((b) create(kn, jm)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.AbstractC7487wq
                public final Object invokeSuspend(Object obj) {
                    MN mn = MN.d;
                    C1795Pt1.b(obj);
                    EK1 ek1 = C6104qF0.h;
                    if (ek1 == null) {
                        Intrinsics.l("storage");
                        throw null;
                    }
                    ek1.p.b(EK1.z[17], Boolean.TRUE);
                    return Unit.a;
                }
            }

            @InterfaceC3368dU(c = "com.base.feature.support.chat.ChatInitializerBase$subscribeOnUpdates$4$2$3", f = "ChatInitializerBase.kt", l = {}, m = "invokeSuspend")
            public static final class c extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
                public c() {
                    throw null;
                }

                @Override // defpackage.AbstractC7487wq
                public final JM<Unit> create(Object obj, JM<?> jm) {
                    return new c(2, jm);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(KN kn, JM<? super Unit> jm) {
                    return ((c) create(kn, jm)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.AbstractC7487wq
                public final Object invokeSuspend(Object obj) {
                    MN mn = MN.d;
                    C1795Pt1.b(obj);
                    if (C6104qF0.a != null) {
                        EK1 ek1 = C6104qF0.h;
                        if (ek1 == null) {
                            Intrinsics.l("storage");
                            throw null;
                        }
                        ek1.h("");
                        ((W92) ((C4201hS) C6104qF0.d()).l.get()).a();
                    }
                    return Unit.a;
                }
            }

            @InterfaceC3368dU(c = "com.base.feature.support.chat.ChatInitializerBase$subscribeOnUpdates$4$2", f = "ChatInitializerBase.kt", l = {75, 79, 83}, m = "emit")
            public static final class d extends LM {
                public boolean d;
                public /* synthetic */ Object e;
                public final /* synthetic */ a<T> g;
                public int h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public d(a<? super T> aVar, JM<? super d> jm) {
                    super(jm);
                    this.g = aVar;
                }

                @Override // defpackage.AbstractC7487wq
                public final Object invokeSuspend(Object obj) {
                    this.e = obj;
                    this.h |= Integer.MIN_VALUE;
                    return this.g.b(false, this);
                }
            }

            public a(XA xa) {
                this.d = xa;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final /* bridge */ /* synthetic */ Object a(Object obj, JM jm) {
                return b(((Boolean) obj).booleanValue(), jm);
            }

            /* JADX WARN: Code duplicated, block: B:25:0x0064 A[PHI: r8
              0x0064: PHI (r8v2 boolean) = (r8v0 boolean), (r8v0 boolean), (r8v5 boolean) binds: [B:21:0x004e, B:23:0x0061, B:17:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
            
                if (defpackage.C5189lv.p(r9, r2, r0) == r1) goto L30;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
            
                if (defpackage.C5189lv.p(r9, r2, r0) == r1) goto L30;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object b(boolean r8, defpackage.JM<? super kotlin.Unit> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof XA.g.a.d
                    if (r0 == 0) goto L13
                    r0 = r9
                    XA$g$a$d r0 = (XA.g.a.d) r0
                    int r1 = r0.h
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.h = r1
                    goto L18
                L13:
                    XA$g$a$d r0 = new XA$g$a$d
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.e
                    MN r1 = defpackage.MN.d
                    int r2 = r0.h
                    r3 = 3
                    r4 = 1
                    r5 = 0
                    r6 = 2
                    if (r2 == 0) goto L3d
                    if (r2 == r4) goto L37
                    if (r2 == r6) goto L33
                    if (r2 != r3) goto L2b
                    goto L33
                L2b:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L33:
                    defpackage.C1795Pt1.b(r9)
                    goto L8c
                L37:
                    boolean r8 = r0.d
                    defpackage.C1795Pt1.b(r9)
                    goto L64
                L3d:
                    defpackage.C1795Pt1.b(r9)
                    if (r8 == 0) goto L78
                    XA r9 = r7.d
                    kf r9 = r9.e
                    GP1 r9 = r9.C
                    java.lang.Object r9 = r9.getValue()
                    java.lang.String r9 = (java.lang.String) r9
                    if (r9 == 0) goto L64
                    RV r2 = defpackage.C6266r20.a
                    zn0 r2 = defpackage.QV0.a
                    XA$g$a$a r3 = new XA$g$a$a
                    r3.<init>(r9, r5)
                    r0.d = r8
                    r0.h = r4
                    java.lang.Object r9 = defpackage.C5189lv.p(r2, r3, r0)
                    if (r9 != r1) goto L64
                    goto L8b
                L64:
                    RV r9 = defpackage.C6266r20.a
                    zn0 r9 = defpackage.QV0.a
                    XA$g$a$b r2 = new XA$g$a$b
                    r2.<init>(r6, r5)
                    r0.d = r8
                    r0.h = r6
                    java.lang.Object r8 = defpackage.C5189lv.p(r9, r2, r0)
                    if (r8 != r1) goto L8c
                    goto L8b
                L78:
                    RV r9 = defpackage.C6266r20.a
                    zn0 r9 = defpackage.QV0.a
                    XA$g$a$c r2 = new XA$g$a$c
                    r2.<init>(r6, r5)
                    r0.d = r8
                    r0.h = r3
                    java.lang.Object r8 = defpackage.C5189lv.p(r9, r2, r0)
                    if (r8 != r1) goto L8c
                L8b:
                    return r1
                L8c:
                    kotlin.Unit r8 = kotlin.Unit.a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: XA.g.a.b(boolean, JM):java.lang.Object");
            }
        }

        public static final class b implements InterfaceC6396rf0<Boolean> {
            public final /* synthetic */ GP1 d;

            public static final class a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ InterfaceC6606sf0 d;

                /* JADX INFO: renamed from: XA$g$b$a$a, reason: collision with other inner class name */
                @InterfaceC3368dU(c = "com.base.feature.support.chat.ChatInitializerBase$subscribeOnUpdates$4$invokeSuspend$$inlined$map$1$2", f = "ChatInitializerBase.kt", l = {219}, m = "emit")
                public static final class C0188a extends LM {
                    public /* synthetic */ Object d;
                    public int e;

                    public C0188a(JM jm) {
                        super(jm);
                    }

                    @Override // defpackage.AbstractC7487wq
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.d = obj;
                        this.e |= Integer.MIN_VALUE;
                        return a.this.a(null, this);
                    }
                }

                public a(InterfaceC6606sf0 interfaceC6606sf0) {
                    this.d = interfaceC6606sf0;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.InterfaceC6606sf0
                @Nullable
                public final Object a(Object obj, @NotNull JM jm) {
                    C0188a c0188a;
                    if (jm instanceof C0188a) {
                        c0188a = (C0188a) jm;
                        int i = c0188a.e;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c0188a.e = i - Integer.MIN_VALUE;
                        } else {
                            c0188a = new C0188a(jm);
                        }
                    } else {
                        c0188a = new C0188a(jm);
                    }
                    Object obj2 = c0188a.d;
                    MN mn = MN.d;
                    int i2 = c0188a.e;
                    if (i2 == 0) {
                        C1795Pt1.b(obj2);
                        Boolean boolValueOf = Boolean.valueOf(((C6945uG) obj) != null);
                        c0188a.e = 1;
                        if (this.d.a(boolValueOf, c0188a) == mn) {
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

            public b(GP1 gp1) {
                this.d = gp1;
            }

            @Override // defpackage.InterfaceC6396rf0
            @Nullable
            public final Object c(@NotNull InterfaceC6606sf0<? super Boolean> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
                this.d.c(new a(interfaceC6606sf0), jm);
                return MN.d;
            }
        }

        public g(JM<? super g> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return XA.this.new g(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((g) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                XA xa = XA.this;
                InterfaceC6396rf0 interfaceC6396rf0M = C4466ii.m(new b(xa.e.k));
                a aVar = new a(xa);
                this.d = 1;
                if (interfaceC6396rf0M.c(aVar, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    public XA(@NotNull TA chatInfoBuilder, @NotNull IV1 supportMessagesDataMapManager, @NotNull Set<ZI1<?>> sessionValues, @NotNull AbstractC5251mB chatUniqueInitValueUseCase, @NotNull C4923kf appData) {
        Intrinsics.checkNotNullParameter(chatInfoBuilder, "chatInfoBuilder");
        Intrinsics.checkNotNullParameter(supportMessagesDataMapManager, "supportMessagesDataMapManager");
        Intrinsics.checkNotNullParameter(sessionValues, "sessionValues");
        Intrinsics.checkNotNullParameter(chatUniqueInitValueUseCase, "chatUniqueInitValueUseCase");
        Intrinsics.checkNotNullParameter(appData, "appData");
        this.a = chatInfoBuilder;
        this.b = supportMessagesDataMapManager;
        this.c = sessionValues;
        this.d = chatUniqueInitValueUseCase;
        this.e = appData;
        C4201hS c4201hS = C6104qF0.a;
        Intrinsics.checkNotNullParameter(this, "l");
        if (C6104qF0.a != null) {
            c(((InterfaceC1153Ho0) ((C4201hS) C6104qF0.d()).n.get()).getState().b);
        }
        C6104qF0.d.add(new WeakReference<>(this));
        this.f = new b(chatInfoBuilder.d());
        this.g = new c(chatInfoBuilder.c());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d7, code lost:
    
        if (defpackage.C5189lv.p(r11, r2, r0) == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.XA r9, com.jivosite.sdk.support.builders.ContactInfo r10, defpackage.JM r11) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.XA.d(XA, com.jivosite.sdk.support.builders.ContactInfo, JM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if (defpackage.C5189lv.p(r6, r1, r0) == r8) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.XA r6, java.util.List r7, defpackage.JM r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof defpackage.C2892bB
            if (r0 == 0) goto L16
            r0 = r8
            bB r0 = (defpackage.C2892bB) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.h = r1
            goto L1b
        L16:
            bB r0 = new bB
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r6 = r0.e
            MN r8 = defpackage.MN.d
            int r1 = r0.h
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            defpackage.C1795Pt1.b(r6)     // Catch: java.lang.IllegalStateException -> L67
            goto L6f
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            java.util.List r7 = r0.d
            defpackage.C1795Pt1.b(r6)     // Catch: java.lang.IllegalStateException -> L67
            goto L52
        L3b:
            defpackage.C1795Pt1.b(r6)
            kotlin.time.b$a r6 = kotlin.time.b.e     // Catch: java.lang.IllegalStateException -> L67
            R40 r6 = defpackage.R40.SECONDS     // Catch: java.lang.IllegalStateException -> L67
            r1 = 5
            long r4 = kotlin.time.c.g(r1, r6)     // Catch: java.lang.IllegalStateException -> L67
            r0.d = r7     // Catch: java.lang.IllegalStateException -> L67
            r0.h = r3     // Catch: java.lang.IllegalStateException -> L67
            java.lang.Object r6 = defpackage.IW.c(r4, r0)     // Catch: java.lang.IllegalStateException -> L67
            if (r6 != r8) goto L52
            goto L66
        L52:
            RV r6 = defpackage.C6266r20.a     // Catch: java.lang.IllegalStateException -> L67
            zn0 r6 = defpackage.QV0.a     // Catch: java.lang.IllegalStateException -> L67
            cB r1 = new cB     // Catch: java.lang.IllegalStateException -> L67
            r3 = 0
            r1.<init>(r7, r3)     // Catch: java.lang.IllegalStateException -> L67
            r0.d = r3     // Catch: java.lang.IllegalStateException -> L67
            r0.h = r2     // Catch: java.lang.IllegalStateException -> L67
            java.lang.Object r6 = defpackage.C5189lv.p(r6, r1, r0)     // Catch: java.lang.IllegalStateException -> L67
            if (r6 != r8) goto L6f
        L66:
            return r8
        L67:
            r6 = move-exception
            java.lang.String r7 = "CHAT_INIT"
            java.lang.String r8 = "Got error when send custom data"
            io.sentry.android.core.b0.d(r7, r8, r6)
        L6f:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.XA.e(XA, java.util.List, JM):java.lang.Object");
    }

    @Override // defpackage.WA
    public final void a() {
        Set<ZI1<?>> set = this.c;
        Objects.toString(CollectionsKt.h0(set));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            C5189lv.k(C3784fT.a, C6266r20.a, new d((ZI1) it.next(), this, null), 2);
        }
        EM em = C3784fT.a;
        RV rv = C6266r20.a;
        C5189lv.k(em, rv, new e(null), 2);
        C5189lv.k(em, rv, new f(null), 2);
        C5189lv.k(em, rv, new g(null), 2);
    }

    @Override // defpackage.WA
    public final void b() {
        C5189lv.k(C3784fT.a, null, new a(null), 3);
    }

    @Override // defpackage.InterfaceC7325w41
    public final void c(boolean z) {
        this.b.a(z);
    }
}
