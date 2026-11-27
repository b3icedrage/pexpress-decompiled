package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl.NewHtcHomeBadger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Qp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LQp;", "LZr0;", "LWr0;", "_applicationService", "LUt0;", "_queryHelper", "Lus0;", "_databaseProvider", "<init>", "(LWr0;LUt0;Lus0;)V", "", "areBadgeSettingsEnabled", "()Z", "areBadgesEnabled", "", "updateStandard", "()V", "updateFallback", "update", "", NewHtcHomeBadger.COUNT, "updateCount", "(I)V", "LWr0;", "LUt0;", "Lus0;", "badgesEnabled", "I", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C1859Qp implements InterfaceC2598Zr0 {

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    @NotNull
    private final InterfaceC7073us0 _databaseProvider;

    @NotNull
    private final InterfaceC2184Ut0 _queryHelper;
    private int badgesEnabled;

    /* JADX INFO: renamed from: Qp$a */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lns0;", "it", "", "invoke", "(Lns0;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class a extends ML0 implements Function1<InterfaceC5604ns0, Unit> {
        final /* synthetic */ C2590Zo1 $notificationCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2590Zo1 c2590Zo1) {
            super(1);
            this.$notificationCount = c2590Zo1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5604ns0 interfaceC5604ns0) {
            invoke2(interfaceC5604ns0);
            return Unit.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull InterfaceC5604ns0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$notificationCount.d = it.getCount();
        }
    }

    public C1859Qp(@NotNull InterfaceC2338Wr0 _applicationService, @NotNull InterfaceC2184Ut0 _queryHelper, @NotNull InterfaceC7073us0 _databaseProvider) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_queryHelper, "_queryHelper");
        Intrinsics.checkNotNullParameter(_databaseProvider, "_databaseProvider");
        this._applicationService = _applicationService;
        this._queryHelper = _queryHelper;
        this._databaseProvider = _databaseProvider;
        this.badgesEnabled = -1;
    }

    private final boolean areBadgeSettingsEnabled() {
        int i = this.badgesEnabled;
        if (i != -1) {
            return i == 1;
        }
        try {
            ApplicationInfo applicationInfo = this._applicationService.getAppContext().getPackageManager().getApplicationInfo(this._applicationService.getAppContext().getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "_applicationService.appC…A_DATA,\n                )");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                this.badgesEnabled = !"DISABLE".equals(bundle.getString("com.onesignal.BadgeCount")) ? 1 : 0;
            } else {
                this.badgesEnabled = 1;
            }
        } catch (PackageManager.NameNotFoundException e) {
            this.badgesEnabled = 0;
            NS0.error("Error reading meta-data tag 'com.onesignal.BadgeCount'. Disabling badge setting.", e);
        }
        return this.badgesEnabled == 1;
    }

    private final boolean areBadgesEnabled() {
        return areBadgeSettingsEnabled() && C6913u61.areNotificationsEnabled$default(C6913u61.INSTANCE, this._applicationService.getAppContext(), null, 2, null);
    }

    private final void updateFallback() {
        C2590Zo1 c2590Zo1 = new C2590Zo1();
        InterfaceC6863ts0.a.query$default(this._databaseProvider.getOs(), "notification", null, this._queryHelper.recentUninteractedWithNotificationsWhere().toString(), null, null, null, null, String.valueOf(InterfaceC1794Pt0.a.INSTANCE.getMaxNumberOfNotifications()), new a(c2590Zo1), 122, null);
        updateCount(c2590Zo1.d);
    }

    private final void updateStandard() {
        int i = 0;
        for (StatusBarNotification statusBarNotification : C6913u61.INSTANCE.getActiveNotifications(this._applicationService.getAppContext())) {
            if (!C6913u61.INSTANCE.isGroupSummary(statusBarNotification)) {
                i++;
            }
        }
        updateCount(i);
    }

    @Override // defpackage.InterfaceC2598Zr0
    public void update() {
        if (areBadgesEnabled()) {
            updateStandard();
        }
    }

    @Override // defpackage.InterfaceC2598Zr0
    public void updateCount(int count) {
        if (areBadgeSettingsEnabled()) {
            try {
                SK1.applyCountOrThrow(this._applicationService.getAppContext(), count);
            } catch (RK1 unused) {
            }
        }
    }
}
