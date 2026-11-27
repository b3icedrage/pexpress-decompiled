package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7810yO implements InterfaceC7600xO {

    @NotNull
    public final InterfaceC1442Lg1 a;

    @NotNull
    public final d b;

    @NotNull
    public final c c;

    @NotNull
    public final e d;

    @NotNull
    public final a e;

    @NotNull
    public final b f;

    @NotNull
    public final InterfaceC6396rf0<String> g;

    @NotNull
    public final InterfaceC6396rf0<Long> h;

    @NotNull
    public final InterfaceC6396rf0<String> i;

    @NotNull
    public final InterfaceC6396rf0<String> j;

    @NotNull
    public final InterfaceC6396rf0<Boolean> k;

    /* JADX INFO: renamed from: yO$a */
    public static final class a implements InterfaceC7031ug1<String> {
        public final AbstractC0662Bg1.a<String> a = C1052Gg1.d("COUPON_PERCENT");

        @Override // defpackage.InterfaceC7031ug1
        public final AbstractC0662Bg1.a<String> getKey() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: yO$b */
    public static final class b implements InterfaceC7031ug1<Boolean> {
        public final AbstractC0662Bg1.a<Boolean> a = C1052Gg1.a("COUPON_VALID");

        @Override // defpackage.InterfaceC7031ug1
        public final AbstractC0662Bg1.a<Boolean> getKey() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: yO$c */
    public static final class c implements InterfaceC7031ug1<Long> {
        public final AbstractC0662Bg1.a<Long> a = C1052Gg1.c("ESTIMATED_TIME_BY_COUPON");

        @Override // defpackage.InterfaceC7031ug1
        public final AbstractC0662Bg1.a<Long> getKey() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: yO$d */
    public static final class d implements InterfaceC7031ug1<String> {
        public final AbstractC0662Bg1.a<String> a = C1052Gg1.d("HAS_COUPON");

        @Override // defpackage.InterfaceC7031ug1
        public final AbstractC0662Bg1.a<String> getKey() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: yO$e */
    public static final class e implements InterfaceC7031ug1<String> {
        public final AbstractC0662Bg1.a<String> a = C1052Gg1.d("COUPON_ID");

        @Override // defpackage.InterfaceC7031ug1
        public final AbstractC0662Bg1.a<String> getKey() {
            return this.a;
        }
    }

    public C7810yO(@NotNull InterfaceC1442Lg1 preferencesRepository) {
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.a = preferencesRepository;
        d dVar = new d();
        this.b = dVar;
        c cVar = new c();
        this.c = cVar;
        e eVar = new e();
        this.d = eVar;
        a aVar = new a();
        this.e = aVar;
        b bVar = new b();
        this.f = bVar;
        this.g = preferencesRepository.d(dVar, "");
        this.h = preferencesRepository.d(cVar, 0L);
        this.i = preferencesRepository.d(eVar, "");
        this.j = preferencesRepository.d(aVar, "0%");
        this.k = preferencesRepository.d(bVar, Boolean.FALSE);
    }

    @Override // defpackage.InterfaceC7600xO
    @NotNull
    public final InterfaceC6396rf0<String> a() {
        return this.i;
    }

    @Override // defpackage.InterfaceC7600xO
    @Nullable
    public final Object b(@NotNull C5500nO c5500nO, @NotNull C5077lO.f fVar) {
        return this.a.b(this.d, new DO(1, c5500nO, Intrinsics.a.class, "suspendConversion0", "writeLastCouponId$suspendConversion0$1(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), fVar);
    }

    @Override // defpackage.InterfaceC7600xO
    @Nullable
    public final Object c(@NotNull X5 x5, @NotNull C5077lO.f fVar) {
        return this.a.b(this.b, new CO(1, x5, Intrinsics.a.class, "suspendConversion0", "writeHasCoupon$suspendConversion0(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), fVar);
    }

    @Override // defpackage.InterfaceC7600xO
    @Nullable
    public final Object d(@NotNull Function0 function0, @NotNull AW1 aw1) {
        return this.a.b(this.c, new BO(1, function0, Intrinsics.a.class, "suspendConversion0", "writeEstimatedTimeByCoupon$suspendConversion0$0(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), aw1);
    }

    @Override // defpackage.InterfaceC7600xO
    @NotNull
    public final InterfaceC6396rf0<String> e() {
        return this.j;
    }

    @Override // defpackage.InterfaceC7600xO
    @Nullable
    public final Object f(@NotNull Function0 function0, @NotNull C7179vO c7179vO) {
        return this.a.b(this.f, new AO(1, function0, Intrinsics.a.class, "suspendConversion0", "writeCouponValid$suspendConversion0$3(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), c7179vO);
    }

    @Override // defpackage.InterfaceC7600xO
    @NotNull
    public final InterfaceC6396rf0<String> g() {
        return this.g;
    }

    @Override // defpackage.InterfaceC7600xO
    @NotNull
    public final InterfaceC6396rf0<Boolean> h() {
        return this.k;
    }

    @Override // defpackage.InterfaceC7600xO
    @NotNull
    public final InterfaceC6396rf0<Long> i() {
        return this.h;
    }

    @Override // defpackage.InterfaceC7600xO
    @Nullable
    public final Object j(@NotNull A0 a0, @NotNull C5077lO.f fVar) {
        return this.a.b(this.e, new C8020zO(1, a0, Intrinsics.a.class, "suspendConversion0", "writeCouponPercent$suspendConversion0$2(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), fVar);
    }
}
