package defpackage;

import com.jivosite.sdk.model.pojo.CustomData;
import com.jivosite.sdk.support.builders.ContactInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class UA implements TA {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final ConcurrentHashMap<String, Object> b;

    @NotNull
    public final GP1 c;

    @NotNull
    public final GP1 d;

    @NotNull
    public final C6120qK1 e;

    @NotNull
    public final InterfaceC6396rf0<String> f;

    @NotNull
    public final InterfaceC6396rf0<ContactInfo> g;

    @NotNull
    public final InterfaceC6396rf0<List<CustomData>> h;

    @NotNull
    public final ArrayList i;

    public static final class a implements Function1<Pair<? extends String, ? extends Object>, CharSequence> {
        public static final a d = new a();

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Pair<? extends String, ? extends Object> pair) {
            Pair<? extends String, ? extends Object> it = pair;
            Intrinsics.checkNotNullParameter(it, "it");
            return it.d + "\n" + it.e;
        }
    }

    @InterfaceC3368dU(c = "com.base.feature.support.chat.ChatInfoBuilderBase$info$2", f = "ChatInfoBuilderBase.kt", l = {}, m = "invokeSuspend")
    public static final class b extends AW1 implements InterfaceC1138Hj0<String, String, String, JM<? super ContactInfo>, Object> {
        public /* synthetic */ String d;
        public /* synthetic */ String e;
        public /* synthetic */ String g;

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            String str = this.d;
            String str2 = this.e;
            String str3 = this.g;
            Intrinsics.checkNotNullParameter(str2, "<set-?>");
            return new ContactInfo(str3, str2, "", str);
        }

        @Override // defpackage.InterfaceC1138Hj0
        public final Object l(String str, String str2, String str3, JM<? super ContactInfo> jm) {
            b bVar = new b(4, jm);
            bVar.d = str;
            bVar.e = str2;
            bVar.g = str3;
            return bVar.invokeSuspend(Unit.a);
        }
    }

    public static final class c implements InterfaceC6396rf0<String> {
        public final /* synthetic */ GP1 d;

        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: UA$c$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.support.chat.ChatInfoBuilderBase$special$$inlined$filter$1$2", f = "ChatInfoBuilderBase.kt", l = {219}, m = "emit")
            public static final class C0149a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0149a(JM jm) {
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
                C0149a c0149a;
                if (jm instanceof C0149a) {
                    c0149a = (C0149a) jm;
                    int i = c0149a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0149a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0149a = new C0149a(jm);
                    }
                } else {
                    c0149a = new C0149a(jm);
                }
                Object obj2 = c0149a.d;
                MN mn = MN.d;
                int i2 = c0149a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    if (((String) obj).length() > 0) {
                        c0149a.e = 1;
                        if (this.d.a(obj, c0149a) == mn) {
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

        public c(GP1 gp1) {
            this.d = gp1;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super String> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
            this.d.c(new a(interfaceC6606sf0), jm);
            return MN.d;
        }
    }

    public static final class d implements InterfaceC6396rf0<String> {
        public final /* synthetic */ C6120qK1 d;
        public final /* synthetic */ UA e;

        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;
            public final /* synthetic */ UA e;

            /* JADX INFO: renamed from: UA$d$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.support.chat.ChatInfoBuilderBase$special$$inlined$map$1$2", f = "ChatInfoBuilderBase.kt", l = {219}, m = "emit")
            public static final class C0150a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0150a(JM jm) {
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

            public a(InterfaceC6606sf0 interfaceC6606sf0, UA ua) {
                this.d = interfaceC6606sf0;
                this.e = ua;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0150a c0150a;
                if (jm instanceof C0150a) {
                    c0150a = (C0150a) jm;
                    int i = c0150a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0150a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0150a = new C0150a(jm);
                    }
                } else {
                    c0150a = new C0150a(jm);
                }
                Object obj2 = c0150a.d;
                MN mn = MN.d;
                int i2 = c0150a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    String strJ = CollectionsKt.J(RW0.m(this.e.b), "\n\n", null, null, a.d, 30);
                    c0150a.e = 1;
                    if (this.d.a(strJ, c0150a) == mn) {
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

        public d(C6120qK1 c6120qK1, UA ua) {
            this.d = c6120qK1;
            this.e = ua;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super String> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
            this.d.c(new a(interfaceC6606sf0, this.e), jm);
            return MN.d;
        }
    }

    public static final class e implements InterfaceC6396rf0<List<? extends CustomData>> {
        public final /* synthetic */ C6120qK1 d;
        public final /* synthetic */ UA e;

        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;
            public final /* synthetic */ UA e;

            /* JADX INFO: renamed from: UA$e$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.support.chat.ChatInfoBuilderBase$special$$inlined$map$2$2", f = "ChatInfoBuilderBase.kt", l = {219}, m = "emit")
            public static final class C0151a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0151a(JM jm) {
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

            public a(InterfaceC6606sf0 interfaceC6606sf0, UA ua) {
                this.d = interfaceC6606sf0;
                this.e = ua;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0151a c0151a;
                RandomAccess randomAccess;
                if (jm instanceof C0151a) {
                    c0151a = (C0151a) jm;
                    int i = c0151a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0151a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0151a = new C0151a(jm);
                    }
                } else {
                    c0151a = new C0151a(jm);
                }
                Object obj2 = c0151a.d;
                MN mn = MN.d;
                int i2 = c0151a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    UA ua = this.e;
                    if (ua.a.b.getValue() == null) {
                        randomAccess = C5653o60.d;
                    } else {
                        ConcurrentHashMap<String, Object> concurrentHashMap = ua.b;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, Object> entry : concurrentHashMap.entrySet()) {
                            if (ua.i.contains(entry.getKey())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        List<Pair> listM = RW0.m(linkedHashMap);
                        ArrayList arrayList = new ArrayList(XE.m(listM, 10));
                        for (Pair pair : listM) {
                            String str = (String) pair.d;
                            Object obj3 = pair.e;
                            String string = obj3.toString();
                            EnumC2694aJ1 enumC2694aJ1 = EnumC2694aJ1.TOKEN_ID_KEY;
                            arrayList.add(new CustomData(string, str, Intrinsics.a(str, "user_lookup") ? obj3.toString() : "", ""));
                        }
                        randomAccess = arrayList;
                    }
                    c0151a.e = 1;
                    if (this.d.a(randomAccess, c0151a) == mn) {
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

        public e(C6120qK1 c6120qK1, UA ua) {
            this.d = c6120qK1;
            this.e = ua;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super List<? extends CustomData>> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
            this.d.c(new a(interfaceC6606sf0, this.e), jm);
            return MN.d;
        }
    }

    public UA(@NotNull C4923kf appData) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        this.a = appData;
        this.b = new ConcurrentHashMap<>();
        GP1 gp1I = C1589Ne.i("");
        this.c = gp1I;
        GP1 gp1I2 = C1589Ne.i("");
        this.d = gp1I2;
        C6120qK1 c6120qK1G = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.e = c6120qK1G;
        InterfaceC6396rf0<String> interfaceC6396rf0M = C4466ii.m(new d(c6120qK1G, this));
        this.f = interfaceC6396rf0M;
        this.g = C4466ii.m(C4466ii.k(interfaceC6396rf0M, gp1I, new c(gp1I2), new b(4, null)));
        this.h = C4466ii.m(new e(c6120qK1G, this));
        List listF = WE.f(EnumC2694aJ1.VERSION_KEY, EnumC2694aJ1.VERIFIED, EnumC2694aJ1.AD_ID_KEY, EnumC2694aJ1.DID_USER_START_DEMO_TRADING_KEY, EnumC2694aJ1.USER_BALANCE_KEY, EnumC2694aJ1.REG_KEY, EnumC2694aJ1.USER_LOOKUP, EnumC2694aJ1.EXPERIMENTS_KEY, EnumC2694aJ1.LANGUAGE_KEY, EnumC2694aJ1.IS_USER_ACTIVATED_KEY);
        ArrayList arrayList = new ArrayList(XE.m(listF, 10));
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            arrayList.add(((EnumC2694aJ1) it.next()).d);
        }
        this.i = arrayList;
    }

    @Override // defpackage.TA
    public final void a(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        GP1 gp1 = this.c;
        gp1.getClass();
        gp1.m(null, value);
    }

    @Override // defpackage.TA
    @Nullable
    public final Object b(@NotNull EnumC2694aJ1 enumC2694aJ1, @Nullable Object obj, @NotNull JM<? super Unit> jm) throws Throwable {
        String str = enumC2694aJ1.d;
        Objects.toString(obj);
        this.b.put(enumC2694aJ1.d, String.valueOf(obj));
        C6120qK1 c6120qK1 = this.e;
        Unit unit = Unit.a;
        Object objA = c6120qK1.a(unit, jm);
        return objA == MN.d ? objA : unit;
    }

    @Override // defpackage.TA
    @NotNull
    public final InterfaceC6396rf0<List<CustomData>> c() {
        return this.h;
    }

    @Override // defpackage.TA
    @NotNull
    public final InterfaceC6396rf0<ContactInfo> d() {
        return this.g;
    }

    @Override // defpackage.TA
    public final void setId(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        GP1 gp1 = this.d;
        gp1.getClass();
        gp1.m(null, value);
    }
}
