package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: hx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4308hx0 implements InterfaceC1959Rw0 {

    @NotNull
    public final ReporterApi a;

    public C4308hx0(@NotNull ReporterApi reporterApi) {
        Intrinsics.checkNotNullParameter(reporterApi, "reporterApi");
        this.a = reporterApi;
    }

    @Override // defpackage.InterfaceC1959Rw0
    public final void a(@NotNull InterfaceC1791Ps0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String url = event.getResult().getUrl();
        if (url != null ? StringsKt.C(url, "t.me", false) : false) {
            this.a.l(EnumC5028l80.I0);
        }
    }
}
