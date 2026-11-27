package defpackage;

import E10.c;
import com.google.gson.Gson;
import defpackage.InterfaceC7722xy0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Ay0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0637Ay0<O extends E10.c, T extends InterfaceC7722xy0<O>> {

    @NotNull
    public final InterfaceC0715By0 a;

    @NotNull
    public final Gson b;

    @NotNull
    public final InterfaceC6396rf0<Boolean> c;

    public AbstractC0637Ay0(@NotNull InterfaceC0715By0 indicatorParamsUseCase, @NotNull C6348rR customIndicatorsExperimentProvider) {
        Intrinsics.checkNotNullParameter(indicatorParamsUseCase, "indicatorParamsUseCase");
        Intrinsics.checkNotNullParameter(customIndicatorsExperimentProvider, "customIndicatorsExperimentProvider");
        this.a = indicatorParamsUseCase;
        this.b = new Gson();
        this.c = customIndicatorsExperimentProvider.c;
    }

    @NotNull
    public abstract Class<T> a();

    @NotNull
    public abstract T b();

    @NotNull
    public abstract CR0 c();

    @NotNull
    public final C6610sg0 d() {
        return new C6610sg0(new C5981pg0(this.a.b(c().d), this, 1), this.c, new C7932yy0(this, null));
    }
}
