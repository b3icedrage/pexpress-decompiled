package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class M6 extends C7576xG {

    @NotNull
    public final InterfaceC6396rf0<List<C6680t02>> d;

    @NotNull
    public final InterfaceC6396rf0<List<C5508nQ1>> e;

    public M6(@NotNull InterfaceC6890u02 topStepsProviderApi) {
        Intrinsics.checkNotNullParameter(topStepsProviderApi, "topStepsProviderApi");
        this.d = topStepsProviderApi.a();
        this.e = topStepsProviderApi.b();
    }
}
