package defpackage;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u001b\u0010\u000e\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"LOA0;", "Ldt0;", "Lsu0;", "_prefs", "<init>", "(Lsu0;)V", "Ljava/util/UUID;", "getId", "(LJM;)Ljava/lang/Object;", "Lsu0;", "currentId$delegate", "LfO0;", "getCurrentId", "()Ljava/util/UUID;", "currentId", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class OA0 implements InterfaceC3456dt0 {

    @NotNull
    private final InterfaceC6659su0 _prefs;

    /* JADX INFO: renamed from: currentId$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3770fO0 currentId;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a extends ML0 implements Function0<UUID> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final UUID invoke() {
            String string$default = InterfaceC6659su0.a.getString$default(OA0.this._prefs, "OneSignal", "PREFS_OS_INSTALL_ID", null, 4, null);
            if (string$default != null) {
                return UUID.fromString(string$default);
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            OA0.this._prefs.saveString("OneSignal", "PREFS_OS_INSTALL_ID", uuidRandomUUID.toString());
            return uuidRandomUUID;
        }
    }

    public OA0(@NotNull InterfaceC6659su0 _prefs) {
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        this._prefs = _prefs;
        this.currentId = XO0.b(new a());
    }

    private final UUID getCurrentId() {
        Object value = this.currentId.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-currentId>(...)");
        return (UUID) value;
    }

    @Override // defpackage.InterfaceC3456dt0
    @Nullable
    public Object getId(@NotNull JM<? super UUID> jm) {
        return getCurrentId();
    }
}
