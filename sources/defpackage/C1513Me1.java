package defpackage;

import com.api.core.deeplinks.models.PromoCodeDeeplinkData;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Me1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1513Me1 implements FU<PromoCodeDeeplinkData> {

    @NotNull
    public final GU a = GU.NAVIGATE_TO_PLATFORM_SHOW_PROMO_CODE;

    @Override // defpackage.FU
    public final Object a(Object obj, HU hu) {
        return Unit.a;
    }

    @Override // defpackage.FU
    @NotNull
    public final GU getKey() {
        return this.a;
    }
}
