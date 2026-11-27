package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: p92, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5877p92 implements InterfaceC4824k92 {

    @NotNull
    public final InterfaceC1442Lg1 a;

    @NotNull
    public final InterfaceC4824k92.a b;

    @NotNull
    public final InterfaceC4824k92.b c;

    @NotNull
    public final a d;

    @NotNull
    public final b e;

    /* JADX INFO: renamed from: p92$a */
    public static final class a implements InterfaceC6396rf0<List<? extends Long>> {
        public final /* synthetic */ InterfaceC6396rf0 d;

        /* JADX INFO: renamed from: p92$a$a, reason: collision with other inner class name */
        public static final class C0469a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: p92$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.trading.usecases.UnsentBetIdsUseCaseBase$special$$inlined$map$1$2", f = "UnsentBetIdsUseCaseBase.kt", l = {219}, m = "emit")
            public static final class C0470a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0470a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0469a.this.a(null, this);
                }
            }

            public C0469a(InterfaceC6606sf0 interfaceC6606sf0) {
                this.d = interfaceC6606sf0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0470a c0470a;
                if (jm instanceof C0470a) {
                    c0470a = (C0470a) jm;
                    int i = c0470a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0470a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0470a = new C0470a(jm);
                    }
                } else {
                    c0470a = new C0470a(jm);
                }
                Object obj2 = c0470a.d;
                MN mn = MN.d;
                int i2 = c0470a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Set set = (Set) obj;
                    ArrayList arrayList = new ArrayList(XE.m(set, 10));
                    Iterator<T> it = set.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Long(Long.parseLong((String) it.next())));
                    }
                    c0470a.e = 1;
                    if (this.d.a(arrayList, c0470a) == mn) {
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

        public a(InterfaceC6396rf0 interfaceC6396rf0) {
            this.d = interfaceC6396rf0;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super List<? extends Long>> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new C0469a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    /* JADX INFO: renamed from: p92$b */
    public static final class b implements InterfaceC6396rf0<List<? extends Long>> {
        public final /* synthetic */ InterfaceC6396rf0 d;

        /* JADX INFO: renamed from: p92$b$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: p92$b$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.trading.usecases.UnsentBetIdsUseCaseBase$special$$inlined$map$2$2", f = "UnsentBetIdsUseCaseBase.kt", l = {219}, m = "emit")
            public static final class C0471a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0471a(JM jm) {
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
                C0471a c0471a;
                if (jm instanceof C0471a) {
                    c0471a = (C0471a) jm;
                    int i = c0471a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0471a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0471a = new C0471a(jm);
                    }
                } else {
                    c0471a = new C0471a(jm);
                }
                Object obj2 = c0471a.d;
                MN mn = MN.d;
                int i2 = c0471a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Set set = (Set) obj;
                    ArrayList arrayList = new ArrayList(XE.m(set, 10));
                    Iterator<T> it = set.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Long(Long.parseLong((String) it.next())));
                    }
                    c0471a.e = 1;
                    if (this.d.a(arrayList, c0471a) == mn) {
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

        public b(InterfaceC6396rf0 interfaceC6396rf0) {
            this.d = interfaceC6396rf0;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super List<? extends Long>> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.c(new a(interfaceC6606sf0), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public C5877p92(@NotNull InterfaceC1442Lg1 preferencesRepositoryApi, @NotNull InterfaceC4824k92.a demoBalanceKeyApi, @NotNull InterfaceC4824k92.b realBalanceKeyApi) {
        Intrinsics.checkNotNullParameter(preferencesRepositoryApi, "preferencesRepositoryApi");
        Intrinsics.checkNotNullParameter(demoBalanceKeyApi, "demoBalanceKeyApi");
        Intrinsics.checkNotNullParameter(realBalanceKeyApi, "realBalanceKeyApi");
        this.a = preferencesRepositoryApi;
        this.b = demoBalanceKeyApi;
        this.c = realBalanceKeyApi;
        C6702t60 c6702t60 = C6702t60.d;
        this.d = new a(preferencesRepositoryApi.d(demoBalanceKeyApi, c6702t60));
        this.e = new b(preferencesRepositoryApi.d(realBalanceKeyApi, c6702t60));
    }

    @Override // defpackage.InterfaceC4824k92
    @Nullable
    public final Object a(@NotNull Z7 z7, @NotNull V7 v7) {
        return this.a.b(this.c, new C6296r92(this, z7, null), v7);
    }

    @Override // defpackage.InterfaceC4824k92
    @Nullable
    public final Object b(@NotNull X7 x7, @NotNull V7 v7) {
        return this.a.b(this.c, new C5667o92(this, x7, null), v7);
    }

    @Override // defpackage.InterfaceC4824k92
    @NotNull
    public final a c() {
        return this.d;
    }

    @Override // defpackage.InterfaceC4824k92
    @Nullable
    public final Object d(@NotNull Y7 y7, @NotNull V7 v7) {
        return this.a.b(this.b, new C6087q92(this, y7, null), v7);
    }

    @Override // defpackage.InterfaceC4824k92
    @Nullable
    public final Object e(@NotNull W7 w7, @NotNull V7 v7) {
        return this.a.b(this.b, new C5457n92(this, w7, null), v7);
    }

    @Override // defpackage.InterfaceC4824k92
    @NotNull
    public final b f() {
        return this.e;
    }
}
