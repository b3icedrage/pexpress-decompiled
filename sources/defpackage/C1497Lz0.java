package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Lz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000  2\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR$\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR$\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR$\u0010\u001e\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001b¨\u0006\""}, d2 = {"LLz0;", "LD01;", "parentModel", "", "parentProperty", "<init>", "(LD01;Ljava/lang/String;)V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getIndirectNotificationAttributionWindow", "()I", "setIndirectNotificationAttributionWindow", "(I)V", "indirectNotificationAttributionWindow", "getNotificationLimit", "setNotificationLimit", "notificationLimit", "getIndirectIAMAttributionWindow", "setIndirectIAMAttributionWindow", "indirectIAMAttributionWindow", "getIamLimit", "setIamLimit", "iamLimit", "", "isDirectEnabled", "()Z", "setDirectEnabled", "(Z)V", "isIndirectEnabled", "setIndirectEnabled", "isUnattributedEnabled", "setUnattributedEnabled", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C1497Lz0 extends D01 {
    public static final int DEFAULT_INDIRECT_ATTRIBUTION_WINDOW = 1440;
    public static final int DEFAULT_NOTIFICATION_LIMIT = 10;

    /* JADX INFO: renamed from: Lz0$b */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends ML0 implements Function0<Integer> {
        public static final b INSTANCE = new b();

        public b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Integer invoke() {
            return 10;
        }
    }

    /* JADX INFO: renamed from: Lz0$c */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c extends ML0 implements Function0<Integer> {
        public static final c INSTANCE = new c();

        public c() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Integer invoke() {
            return Integer.valueOf(C1497Lz0.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW);
        }
    }

    /* JADX INFO: renamed from: Lz0$d */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class d extends ML0 implements Function0<Integer> {
        public static final d INSTANCE = new d();

        public d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Integer invoke() {
            return Integer.valueOf(C1497Lz0.DEFAULT_INDIRECT_ATTRIBUTION_WINDOW);
        }
    }

    /* JADX INFO: renamed from: Lz0$e */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class e extends ML0 implements Function0<Boolean> {
        public static final e INSTANCE = new e();

        public e() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: Lz0$f */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class f extends ML0 implements Function0<Boolean> {
        public static final f INSTANCE = new f();

        public f() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: Lz0$g */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class g extends ML0 implements Function0<Boolean> {
        public static final g INSTANCE = new g();

        public g() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: Lz0$h */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class h extends ML0 implements Function0<Integer> {
        public static final h INSTANCE = new h();

        public h() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Integer invoke() {
            return 10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1497Lz0(@NotNull D01 parentModel, @NotNull String parentProperty) {
        super(parentModel, parentProperty);
        Intrinsics.checkNotNullParameter(parentModel, "parentModel");
        Intrinsics.checkNotNullParameter(parentProperty, "parentProperty");
    }

    public final int getIamLimit() {
        return getIntProperty("iamLimit", b.INSTANCE);
    }

    public final int getIndirectIAMAttributionWindow() {
        return getIntProperty("indirectIAMAttributionWindow", c.INSTANCE);
    }

    public final int getIndirectNotificationAttributionWindow() {
        return getIntProperty("indirectNotificationAttributionWindow", d.INSTANCE);
    }

    public final int getNotificationLimit() {
        return getIntProperty("notificationLimit", h.INSTANCE);
    }

    public final boolean isDirectEnabled() {
        return getBooleanProperty("isDirectEnabled", e.INSTANCE);
    }

    public final boolean isIndirectEnabled() {
        return getBooleanProperty("isIndirectEnabled", f.INSTANCE);
    }

    public final boolean isUnattributedEnabled() {
        return getBooleanProperty("isUnattributedEnabled", g.INSTANCE);
    }

    public final void setDirectEnabled(boolean z) {
        D01.setBooleanProperty$default(this, "isDirectEnabled", z, null, false, 12, null);
    }

    public final void setIamLimit(int i) {
        D01.setIntProperty$default(this, "iamLimit", i, null, false, 12, null);
    }

    public final void setIndirectEnabled(boolean z) {
        D01.setBooleanProperty$default(this, "isIndirectEnabled", z, null, false, 12, null);
    }

    public final void setIndirectIAMAttributionWindow(int i) {
        D01.setIntProperty$default(this, "indirectIAMAttributionWindow", i, null, false, 12, null);
    }

    public final void setIndirectNotificationAttributionWindow(int i) {
        D01.setIntProperty$default(this, "indirectNotificationAttributionWindow", i, null, false, 12, null);
    }

    public final void setNotificationLimit(int i) {
        D01.setIntProperty$default(this, "notificationLimit", i, null, false, 12, null);
    }

    public final void setUnattributedEnabled(boolean z) {
        D01.setBooleanProperty$default(this, "isUnattributedEnabled", z, null, false, 12, null);
    }
}
