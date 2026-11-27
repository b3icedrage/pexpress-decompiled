package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class BL1 implements AL1 {

    @NotNull
    public final InterfaceC1442Lg1 a;

    @NotNull
    public final a b;

    @NotNull
    public final InterfaceC6396rf0<Set<String>> c;

    public static final class a implements InterfaceC7031ug1<Set<? extends String>> {
        public final AbstractC0662Bg1.a<Set<String>> a = C1052Gg1.e("SHOWN_STORIES");

        @Override // defpackage.InterfaceC7031ug1
        public final AbstractC0662Bg1.a<Set<? extends String>> getKey() {
            return this.a;
        }
    }

    public BL1(@NotNull InterfaceC1442Lg1 preferencesRepository) {
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.a = preferencesRepository;
        a aVar = new a();
        this.b = aVar;
        this.c = preferencesRepository.d(aVar, C6702t60.d);
    }

    @Override // defpackage.AL1
    @Nullable
    public final Object a(@NotNull WQ1 wq1, @NotNull AW1 aw1) {
        return this.a.b(this.b, new CL1(this, wq1, null), aw1);
    }

    @Override // defpackage.AL1
    @NotNull
    public final InterfaceC6396rf0<Set<String>> getValue() {
        return this.c;
    }
}
