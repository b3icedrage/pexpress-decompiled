package com.api.feature.analytics.reporters;

import com.google.gson.JsonElement;
import defpackage.C1510Md1;
import defpackage.EnumC5028l80;
import defpackage.EnumC5113la;
import defpackage.EnumC5326ma;
import defpackage.H91;
import defpackage.LM;
import defpackage.P80;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/api/feature/analytics/reporters/ReporterApi;", "", "FeatureAnalyticsApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ReporterApi {

    public static final class a {
        public static void a(ReporterApi reporterApi, EnumC5113la enumC5113la, Object obj) {
            reporterApi.e(enumC5113la, obj, CollectionsKt.e0(EnumC5326ma.i));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static void b(ReporterApi reporterApi, EnumC5028l80 enumC5028l80, P80 p80, List list, int i) {
            if ((i & 2) != 0) {
                p80 = null;
            }
            if ((i & 4) != 0) {
                list = CollectionsKt.e0(EnumC5326ma.i);
            }
            reporterApi.h(enumC5028l80, p80, list, null);
        }

        public static void c(ReporterApi reporterApi, EnumC5113la enumC5113la, Object obj) {
            reporterApi.b(enumC5113la, obj, CollectionsKt.e0(EnumC5326ma.i));
        }
    }

    @Nullable
    Unit a(@NotNull H91 h91, @NotNull LM lm);

    void b(@NotNull EnumC5113la enumC5113la, @NotNull Object obj, @NotNull List<? extends EnumC5326ma> list);

    @Nullable
    Unit c(@NotNull H91 h91, @NotNull Object obj, boolean z);

    void d(boolean z);

    void e(@NotNull EnumC5113la enumC5113la, @NotNull Object obj, @NotNull List<? extends EnumC5326ma> list);

    @Nullable
    Unit f(@NotNull EnumC5028l80 enumC5028l80, @Nullable P80 p80);

    void g(@NotNull EnumC5028l80 enumC5028l80, @Nullable P80 p80, @Nullable String str);

    void h(@NotNull EnumC5028l80 enumC5028l80, @Nullable P80 p80, @NotNull List<? extends EnumC5326ma> list, @Nullable Boolean bool);

    @Nullable
    Unit i(@NotNull H91 h91, @NotNull LM lm);

    void j(@NotNull String str, @NotNull String str2, boolean z);

    @Nullable
    Unit k(@NotNull EnumC5028l80 enumC5028l80, @Nullable C1510Md1 c1510Md1);

    void l(@NotNull EnumC5028l80 enumC5028l80);

    void m(@NotNull EnumC5028l80 enumC5028l80, @Nullable JsonElement jsonElement, @NotNull List<? extends EnumC5326ma> list, @Nullable Boolean bool);
}
