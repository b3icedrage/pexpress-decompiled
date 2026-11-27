package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Za0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R(\u0010\f\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR(\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR(\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0013"}, d2 = {"LZa0;", "LD01;", "parentModel", "", "parentProperty", "<init>", "(LD01;Ljava/lang/String;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getProjectId", "()Ljava/lang/String;", "setProjectId", "(Ljava/lang/String;)V", "projectId", "getAppId", "setAppId", "appId", "getApiKey", "setApiKey", "apiKey", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C2547Za0 extends D01 {

    /* JADX INFO: renamed from: Za0$a */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a extends ML0 implements Function0<String> {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return null;
        }
    }

    /* JADX INFO: renamed from: Za0$b */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends ML0 implements Function0<String> {
        public static final b INSTANCE = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return null;
        }
    }

    /* JADX INFO: renamed from: Za0$c */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c extends ML0 implements Function0<String> {
        public static final c INSTANCE = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2547Za0(@NotNull D01 parentModel, @NotNull String parentProperty) {
        super(parentModel, parentProperty);
        Intrinsics.checkNotNullParameter(parentModel, "parentModel");
        Intrinsics.checkNotNullParameter(parentProperty, "parentProperty");
    }

    @Nullable
    public final String getApiKey() {
        return getOptStringProperty("apiKey", a.INSTANCE);
    }

    @Nullable
    public final String getAppId() {
        return getOptStringProperty("appId", b.INSTANCE);
    }

    @Nullable
    public final String getProjectId() {
        return getOptStringProperty("projectId", c.INSTANCE);
    }

    public final void setApiKey(@Nullable String str) {
        D01.setOptStringProperty$default(this, "apiKey", str, null, false, 12, null);
    }

    public final void setAppId(@Nullable String str) {
        D01.setOptStringProperty$default(this, "appId", str, null, false, 12, null);
    }

    public final void setProjectId(@Nullable String str) {
        D01.setOptStringProperty$default(this, "projectId", str, null, false, 12, null);
    }
}
