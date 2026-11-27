package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zi1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8090zi1 extends C7576xG {

    @NotNull
    public final C4923kf d;

    @NotNull
    public final InterfaceC1211Ih1 e;

    @NotNull
    public final InterfaceC7776yC1 f;

    @NotNull
    public final InterfaceC6638sn0 g;

    @NotNull
    public final InterfaceC4182hL1 h;

    @NotNull
    public final ReporterApi i;

    @NotNull
    public final GP1 j;

    @NotNull
    public final C1699On1 k;

    @NotNull
    public final InterfaceC5910pK1<EnumC6804tc0> l;

    @NotNull
    public final e m;

    @NotNull
    public final C6120qK1 n;

    @NotNull
    public final C1621Nn1 o;

    @NotNull
    public final GP1 p;

    @NotNull
    public final C6610sg0 q;

    @NotNull
    public final f r;

    @NotNull
    public final g s;

    @NotNull
    public final C6610sg0 t;

    @NotNull
    public final i u;

    @NotNull
    public final C6120qK1 v;

    @NotNull
    public final C1621Nn1 w;

    @NotNull
    public final j x;

    /* JADX INFO: renamed from: zi1$a */
    @InterfaceC3368dU(c = "com.base.feature.profileandsettings.profile.screens.ProfileViewModelBase$charCounterState$1", f = "ProfileViewModelBase.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1060Gj0<Boolean, String, JM<? super AbstractC5458nA>, Object> {
        public /* synthetic */ boolean d;
        public /* synthetic */ String e;

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            boolean z = this.d;
            String str = this.e;
            if (z) {
                return new AbstractC5458nA.b(str != null ? str.length() : 0);
            }
            return AbstractC5458nA.a.a;
        }

        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(Boolean bool, String str, JM<? super AbstractC5458nA> jm) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar = new a(3, jm);
            aVar.d = zBooleanValue;
            aVar.e = str;
            return aVar.invokeSuspend(Unit.a);
        }
    }

    /* JADX INFO: renamed from: zi1$b */
    @InterfaceC3368dU(c = "com.base.feature.profileandsettings.profile.screens.ProfileViewModelBase$country$2", f = "ProfileViewModelBase.kt", l = {}, m = "invokeSuspend")
    public static final class b extends AW1 implements InterfaceC1060Gj0<String, HF, JM<? super String>, Object> {
        public /* synthetic */ String d;
        public /* synthetic */ HF e;

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            Object next;
            String str;
            MN mn = MN.d;
            C1795Pt1.b(obj);
            String str2 = this.d;
            HF hf = this.e;
            if (hf != null) {
                Iterator it = hf.a.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.a(((IF) next).a, str2));
                IF r1 = (IF) next;
                if (r1 != null && (str = r1.b) != null) {
                    return str;
                }
            }
            return str2 == null ? "" : str2;
        }

        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(String str, HF hf, JM<? super String> jm) {
            b bVar = new b(3, jm);
            bVar.d = str;
            bVar.e = hf;
            return bVar.invokeSuspend(Unit.a);
        }
    }

    /* JADX INFO: renamed from: zi1$c */
    @InterfaceC3368dU(c = "com.base.feature.profileandsettings.profile.screens.ProfileViewModelBase$onInit$1", f = "ProfileViewModelBase.kt", l = {58}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: zi1$c$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ AbstractC8090zi1 d;

            public a(AbstractC8090zi1 abstractC8090zi1) {
                this.d = abstractC8090zi1;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) throws Throwable {
                C6106qG c6106qG = (C6106qG) obj;
                Object objA = this.d.n.a(c6106qG != null ? c6106qG.b : null, jm);
                return objA == MN.d ? objA : Unit.a;
            }
        }

        public c(JM<? super c> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return AbstractC8090zi1.this.new c(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) throws Throwable {
            ((c) create(kn, jm)).invokeSuspend(Unit.a);
            return MN.d;
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) throws Throwable {
            MN mn = MN.d;
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw EK.c(obj);
            }
            C1795Pt1.b(obj);
            AbstractC8090zi1 abstractC8090zi1 = AbstractC8090zi1.this;
            GP1 gp1 = abstractC8090zi1.d.c;
            a aVar = new a(abstractC8090zi1);
            this.d = 1;
            gp1.c(aVar, this);
            return mn;
        }
    }

    /* JADX INFO: renamed from: zi1$d */
    @InterfaceC3368dU(c = "com.base.feature.profileandsettings.profile.screens.ProfileViewModelBase$onInit$2", f = "ProfileViewModelBase.kt", l = {63}, m = "invokeSuspend")
    public static final class d extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: zi1$d$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ AbstractC8090zi1 d;

            /* JADX INFO: renamed from: zi1$d$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.profileandsettings.profile.screens.ProfileViewModelBase$onInit$2$1", f = "ProfileViewModelBase.kt", l = {66, 67, 71}, m = "emit")
            public static final class C0552a extends LM {
                public a d;
                public /* synthetic */ Object e;
                public final /* synthetic */ a<T> g;
                public int h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0552a(a<? super T> aVar, JM<? super C0552a> jm) {
                    super(jm);
                    this.g = aVar;
                }

                @Override // defpackage.AbstractC7487wq
                public final Object invokeSuspend(Object obj) {
                    this.e = obj;
                    this.h |= Integer.MIN_VALUE;
                    return this.g.a(null, this);
                }
            }

            public a(AbstractC8090zi1 abstractC8090zi1) {
                this.d = abstractC8090zi1;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
            
                if (r8.a(r0) == r1) goto L33;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
            
                if (r2.h.c(defpackage.C8056za.j(r2), (J41.a) r8, r0) == r1) goto L33;
             */
            @Override // defpackage.InterfaceC6606sf0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(defpackage.J41 r8, defpackage.JM<? super kotlin.Unit> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof defpackage.AbstractC8090zi1.d.a.C0552a
                    if (r0 == 0) goto L13
                    r0 = r9
                    zi1$d$a$a r0 = (defpackage.AbstractC8090zi1.d.a.C0552a) r0
                    int r1 = r0.h
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.h = r1
                    goto L18
                L13:
                    zi1$d$a$a r0 = new zi1$d$a$a
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.e
                    MN r1 = defpackage.MN.d
                    int r2 = r0.h
                    r3 = 0
                    r4 = 3
                    r5 = 2
                    r6 = 1
                    if (r2 == 0) goto L40
                    if (r2 == r6) goto L3a
                    if (r2 == r5) goto L36
                    if (r2 != r4) goto L2e
                    defpackage.C1795Pt1.b(r9)
                    goto L8d
                L2e:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L36:
                    defpackage.C1795Pt1.b(r9)
                    goto L6a
                L3a:
                    zi1$d$a r8 = r0.d
                    defpackage.C1795Pt1.b(r9)
                    goto L5b
                L40:
                    defpackage.C1795Pt1.b(r9)
                    boolean r9 = r8 instanceof J41.b
                    zi1 r2 = r7.d
                    if (r9 == 0) goto L6d
                    qK1 r9 = r2.n
                    J41$b r8 = (J41.b) r8
                    java.lang.String r8 = r8.a
                    r0.d = r7
                    r0.h = r6
                    java.lang.Object r8 = r9.a(r8, r0)
                    if (r8 != r1) goto L5a
                    goto L8c
                L5a:
                    r8 = r7
                L5b:
                    zi1 r8 = r8.d
                    hL1 r8 = r8.h
                    r0.d = r3
                    r0.h = r5
                    java.lang.Object r8 = r8.a(r0)
                    if (r8 != r1) goto L6a
                    goto L8c
                L6a:
                    kotlin.Unit r8 = kotlin.Unit.a
                    return r8
                L6d:
                    boolean r9 = r8 instanceof J41.a
                    if (r9 == 0) goto L90
                    r2.getClass()
                    Ai1 r9 = new Ai1
                    r9.<init>(r2, r3)
                    defpackage.C6561sS.g(r2, r9)
                    KN r9 = defpackage.C8056za.j(r2)
                    J41$a r8 = (J41.a) r8
                    r0.h = r4
                    hL1 r2 = r2.h
                    java.lang.Object r8 = r2.c(r9, r8, r0)
                    if (r8 != r1) goto L8d
                L8c:
                    return r1
                L8d:
                    kotlin.Unit r8 = kotlin.Unit.a
                    return r8
                L90:
                    s51 r8 = new s51
                    r8.<init>()
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8090zi1.d.a.a(J41, JM):java.lang.Object");
            }
        }

        public d(JM<? super d> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return AbstractC8090zi1.this.new d(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            ((d) create(kn, jm)).invokeSuspend(Unit.a);
            return MN.d;
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                AbstractC8090zi1 abstractC8090zi1 = AbstractC8090zi1.this;
                C1621Nn1 c1621Nn1B = abstractC8090zi1.g.b();
                a aVar = new a(abstractC8090zi1);
                this.d = 1;
                if (c1621Nn1B.d.c(aVar, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            throw new C3342dL0();
        }
    }

    /* JADX INFO: renamed from: zi1$e */
    public static final class e implements InterfaceC6396rf0<Boolean> {
        public final /* synthetic */ GP1 d;

        /* JADX INFO: renamed from: zi1$e$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: zi1$e$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.profileandsettings.profile.screens.ProfileViewModelBase$special$$inlined$map$1$2", f = "ProfileViewModelBase.kt", l = {219}, m = "emit")
            public static final class C0553a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0553a(JM jm) {
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
                C0553a c0553a;
                if (jm instanceof C0553a) {
                    c0553a = (C0553a) jm;
                    int i = c0553a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0553a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0553a = new C0553a(jm);
                    }
                } else {
                    c0553a = new C0553a(jm);
                }
                Object obj2 = c0553a.d;
                MN mn = MN.d;
                int i2 = c0553a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Boolean boolValueOf = Boolean.valueOf(((C6106qG) obj) == null);
                    c0553a.e = 1;
                    if (this.d.a(boolValueOf, c0553a) == mn) {
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

        public e(GP1 gp1) {
            this.d = gp1;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Boolean> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
            this.d.c(new a(interfaceC6606sf0), jm);
            return MN.d;
        }
    }

    /* JADX INFO: renamed from: zi1$f */
    public static final class f implements InterfaceC6396rf0<Long> {
        public final /* synthetic */ GP1 d;

        /* JADX INFO: renamed from: zi1$f$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: zi1$f$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.profileandsettings.profile.screens.ProfileViewModelBase$special$$inlined$map$2$2", f = "ProfileViewModelBase.kt", l = {219}, m = "emit")
            public static final class C0554a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0554a(JM jm) {
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
                C0554a c0554a;
                if (jm instanceof C0554a) {
                    c0554a = (C0554a) jm;
                    int i = c0554a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0554a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0554a = new C0554a(jm);
                    }
                } else {
                    c0554a = new C0554a(jm);
                }
                Object obj2 = c0554a.d;
                MN mn = MN.d;
                int i2 = c0554a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    C6945uG c6945uG = (C6945uG) obj;
                    Long l = c6945uG != null ? new Long(c6945uG.a) : null;
                    c0554a.e = 1;
                    if (this.d.a(l, c0554a) == mn) {
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

        public f(GP1 gp1) {
            this.d = gp1;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Long> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
            this.d.c(new a(interfaceC6606sf0), jm);
            return MN.d;
        }
    }

    /* JADX INFO: renamed from: zi1$g */
    public static final class g implements InterfaceC6396rf0<String> {
        public final /* synthetic */ GP1 d;

        /* JADX INFO: renamed from: zi1$g$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: zi1$g$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.profileandsettings.profile.screens.ProfileViewModelBase$special$$inlined$map$3$2", f = "ProfileViewModelBase.kt", l = {219}, m = "emit")
            public static final class C0555a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0555a(JM jm) {
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
                C0555a c0555a;
                if (jm instanceof C0555a) {
                    c0555a = (C0555a) jm;
                    int i = c0555a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0555a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0555a = new C0555a(jm);
                    }
                } else {
                    c0555a = new C0555a(jm);
                }
                Object obj2 = c0555a.d;
                MN mn = MN.d;
                int i2 = c0555a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    C6945uG c6945uG = (C6945uG) obj;
                    String str = c6945uG != null ? c6945uG.b : null;
                    c0555a.e = 1;
                    if (this.d.a(str, c0555a) == mn) {
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

        public g(GP1 gp1) {
            this.d = gp1;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super String> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
            this.d.c(new a(interfaceC6606sf0), jm);
            return MN.d;
        }
    }

    /* JADX INFO: renamed from: zi1$h */
    public static final class h implements InterfaceC6396rf0<String> {
        public final /* synthetic */ GP1 d;

        /* JADX INFO: renamed from: zi1$h$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: zi1$h$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.profileandsettings.profile.screens.ProfileViewModelBase$special$$inlined$map$4$2", f = "ProfileViewModelBase.kt", l = {219}, m = "emit")
            public static final class C0556a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0556a(JM jm) {
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
                C0556a c0556a;
                if (jm instanceof C0556a) {
                    c0556a = (C0556a) jm;
                    int i = c0556a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0556a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0556a = new C0556a(jm);
                    }
                } else {
                    c0556a = new C0556a(jm);
                }
                Object obj2 = c0556a.d;
                MN mn = MN.d;
                int i2 = c0556a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    C6945uG c6945uG = (C6945uG) obj;
                    String str = c6945uG != null ? c6945uG.d : null;
                    c0556a.e = 1;
                    if (this.d.a(str, c0556a) == mn) {
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

        public h(GP1 gp1) {
            this.d = gp1;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super String> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
            this.d.c(new a(interfaceC6606sf0), jm);
            return MN.d;
        }
    }

    /* JADX INFO: renamed from: zi1$i */
    public static final class i implements InterfaceC6396rf0<Boolean> {
        public final /* synthetic */ GP1 d;

        /* JADX INFO: renamed from: zi1$i$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: zi1$i$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.profileandsettings.profile.screens.ProfileViewModelBase$special$$inlined$map$5$2", f = "ProfileViewModelBase.kt", l = {219}, m = "emit")
            public static final class C0557a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0557a(JM jm) {
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
                C0557a c0557a;
                if (jm instanceof C0557a) {
                    c0557a = (C0557a) jm;
                    int i = c0557a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0557a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0557a = new C0557a(jm);
                    }
                } else {
                    c0557a = new C0557a(jm);
                }
                Object obj2 = c0557a.d;
                MN mn = MN.d;
                int i2 = c0557a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    C6945uG c6945uG = (C6945uG) obj;
                    Boolean boolValueOf = Boolean.valueOf(c6945uG != null ? c6945uG.o : false);
                    c0557a.e = 1;
                    if (this.d.a(boolValueOf, c0557a) == mn) {
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

        public i(GP1 gp1) {
            this.d = gp1;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Boolean> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
            this.d.c(new a(interfaceC6606sf0), jm);
            return MN.d;
        }
    }

    /* JADX INFO: renamed from: zi1$j */
    public static final class j implements InterfaceC6396rf0<Boolean> {
        public final /* synthetic */ FP1 d;

        /* JADX INFO: renamed from: zi1$j$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: zi1$j$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.profileandsettings.profile.screens.ProfileViewModelBase$special$$inlined$map$6$2", f = "ProfileViewModelBase.kt", l = {219}, m = "emit")
            public static final class C0558a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0558a(JM jm) {
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
                C0558a c0558a;
                if (jm instanceof C0558a) {
                    c0558a = (C0558a) jm;
                    int i = c0558a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0558a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0558a = new C0558a(jm);
                    }
                } else {
                    c0558a = new C0558a(jm);
                }
                Object obj2 = c0558a.d;
                MN mn = MN.d;
                int i2 = c0558a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Boolean boolValueOf = Boolean.valueOf(!(((AbstractC5652o6) obj) instanceof AbstractC5652o6.c));
                    c0558a.e = 1;
                    if (this.d.a(boolValueOf, c0558a) == mn) {
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

        public j(FP1 fp1) {
            this.d = fp1;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Boolean> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public AbstractC8090zi1(@NotNull C4923kf appDataRepository, @NotNull InterfaceC1211Ih1 profileCallbacks, @NotNull InterfaceC7776yC1 saveNicknameUseCase, @NotNull InterfaceC6638sn0 handleNicknameChangeUseCase, @NotNull InterfaceC4182hL1 showErrorUseCase, @NotNull ReporterApi reporter, @NotNull InterfaceC5862p6 activationStateProviderApi) {
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(profileCallbacks, "profileCallbacks");
        Intrinsics.checkNotNullParameter(saveNicknameUseCase, "saveNicknameUseCase");
        Intrinsics.checkNotNullParameter(handleNicknameChangeUseCase, "handleNicknameChangeUseCase");
        Intrinsics.checkNotNullParameter(showErrorUseCase, "showErrorUseCase");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(activationStateProviderApi, "activationStateProviderApi");
        this.d = appDataRepository;
        this.e = profileCallbacks;
        this.f = saveNicknameUseCase;
        this.g = handleNicknameChangeUseCase;
        this.h = showErrorUseCase;
        this.i = reporter;
        Boolean bool = Boolean.FALSE;
        GP1 gp1I = C1589Ne.i(bool);
        this.j = gp1I;
        this.k = C4466ii.f(gp1I);
        this.l = showErrorUseCase.b();
        this.m = new e(appDataRepository.c);
        C6120qK1 c6120qK1G = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.n = c6120qK1G;
        C1621Nn1 c1621Nn1E = C4466ii.e(c6120qK1G);
        this.o = c1621Nn1E;
        GP1 gp1I2 = C1589Ne.i(bool);
        this.p = gp1I2;
        this.q = new C6610sg0(gp1I2, c1621Nn1E, new a(3, null));
        GP1 gp1 = appDataRepository.k;
        this.r = new f(gp1);
        this.s = new g(gp1);
        this.t = new C6610sg0(new h(gp1), appDataRepository.j, new b(3, null));
        this.u = new i(gp1);
        C6120qK1 c6120qK1G2 = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.v = c6120qK1G2;
        this.w = C4466ii.e(c6120qK1G2);
        this.x = new j(activationStateProviderApi.a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        if (r6.a(r8, r0) == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m(defpackage.AbstractC8090zi1 r6, java.lang.String r7, defpackage.LM r8) {
        /*
            boolean r0 = r8 instanceof defpackage.C0824Di1
            if (r0 == 0) goto L13
            r0 = r8
            Di1 r0 = (defpackage.C0824Di1) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            Di1 r0 = new Di1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.h
            MN r1 = defpackage.MN.d
            int r2 = r0.j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r8)
            goto L6e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r7 = r0.g
            java.lang.String r6 = r0.e
            zi1 r2 = r0.d
            defpackage.C1795Pt1.b(r8)
            r5 = r8
            r8 = r6
            r6 = r2
            r2 = r5
            goto L56
        L40:
            defpackage.C1795Pt1.b(r8)
            Nn1 r8 = r6.o
            r0.d = r6
            r0.e = r7
            r0.g = r7
            r0.j = r4
            java.lang.Object r8 = defpackage.C4466ii.o(r8, r0)
            if (r8 != r1) goto L54
            goto L6d
        L54:
            r2 = r8
            r8 = r7
        L56:
            boolean r7 = kotlin.jvm.internal.Intrinsics.a(r7, r2)
            if (r7 != 0) goto L71
            sn0 r6 = r6.g
            r7 = 0
            r0.d = r7
            r0.e = r7
            r0.g = r7
            r0.j = r3
            java.lang.Object r6 = r6.a(r8, r0)
            if (r6 != r1) goto L6e
        L6d:
            return r1
        L6e:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L71:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8090zi1.m(zi1, java.lang.String, LM):java.lang.Object");
    }

    @Override // defpackage.C7576xG
    public final void j() {
        ReporterApi.a.b(this.i, EnumC5028l80.Q0, null, VE.c(EnumC5326ma.e), 10);
        C5189lv.k(C8056za.j(this), null, new c(null), 3);
        C5189lv.k(C8056za.j(this), null, new d(null), 3);
    }

    @NotNull
    public InterfaceC6396rf0<Boolean> l() {
        return this.x;
    }
}
