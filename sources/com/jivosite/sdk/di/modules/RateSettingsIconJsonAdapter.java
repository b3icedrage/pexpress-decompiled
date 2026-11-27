package com.jivosite.sdk.di.modules;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.jivosite.sdk.model.pojo.rate.RateSettings;
import defpackage.AbstractC5897pG0;
import defpackage.AbstractC8000zH0;
import defpackage.InterfaceC2628a02;
import defpackage.InterfaceC4262hj0;
import defpackage.YH0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/jivosite/sdk/di/modules/RateSettingsIconJsonAdapter;", "LpG0;", "Lcom/jivosite/sdk/model/pojo/rate/RateSettings$a;", "<init>", "()V", "LzH0;", "reader", "fromJson", "(LzH0;)Lcom/jivosite/sdk/model/pojo/rate/RateSettings$a;", "LYH0;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(LYH0;Lcom/jivosite/sdk/model/pojo/rate/RateSettings$a;)V", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class RateSettingsIconJsonAdapter extends AbstractC5897pG0<RateSettings.a> {
    @Override // defpackage.AbstractC5897pG0
    @InterfaceC4262hj0
    @Nullable
    /* JADX INFO: renamed from: fromJson, reason: merged with bridge method [inline-methods] */
    public RateSettings.a a(@NotNull AbstractC8000zH0 reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        RateSettings.a aVar = null;
        if (reader.k() == AbstractC8000zH0.b.m) {
            reader.g();
            return null;
        }
        String value = reader.B();
        Intrinsics.checkNotNullExpressionValue(value, "reader.nextString()");
        Intrinsics.checkNotNullParameter(value, "value");
        for (RateSettings.a aVar2 : RateSettings.a.values()) {
            if (aVar2.d.equals(value)) {
                aVar = aVar2;
                break;
            }
        }
        return aVar == null ? RateSettings.a.UNKNOWN : aVar;
    }

    @Override // defpackage.AbstractC5897pG0
    @InterfaceC2628a02
    /* JADX INFO: renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void e(@NotNull YH0 writer, @Nullable RateSettings.a value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        writer.G(value != null ? value.d : null);
    }
}
