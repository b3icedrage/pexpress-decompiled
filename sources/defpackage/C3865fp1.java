package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fp1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3865fp1 implements InterfaceC3655ep1 {

    @NotNull
    public final InterfaceC1442Lg1 a;

    @NotNull
    public final a b;

    @NotNull
    public final InterfaceC6396rf0<String> c;

    /* JADX INFO: renamed from: fp1$a */
    public static final class a implements InterfaceC7031ug1<String> {
        public final AbstractC0662Bg1.a<String> a = C1052Gg1.d("PLAY_REFERRER_VALUE");

        @Override // defpackage.InterfaceC7031ug1
        public final AbstractC0662Bg1.a<String> getKey() {
            return this.a;
        }
    }

    public C3865fp1(@NotNull InterfaceC1442Lg1 preferencesRepository) {
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.a = preferencesRepository;
        a aVar = new a();
        this.b = aVar;
        this.c = preferencesRepository.a(aVar);
    }

    @Override // defpackage.InterfaceC3655ep1
    @Nullable
    public final Object a(@NotNull C6139qR c6139qR) {
        Object objB = this.a.b(this.b, new C4075gp1(1, null), c6139qR);
        return objB == MN.d ? objB : Unit.a;
    }
}
