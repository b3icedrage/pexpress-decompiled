package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.D01;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: iM1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00028\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0011"}, d2 = {"LiM1;", "LD01;", "TModel", "LL01;", "Lkotlin/Function0;", "_create", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lsu0;", "_prefs", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lsu0;)V", "Lorg/json/JSONObject;", "jsonObject", "create", "(Lorg/json/JSONObject;)LD01;", "Lkotlin/jvm/functions/Function0;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class C4395iM1<TModel extends D01> extends L01<TModel> {

    @NotNull
    private final Function0<TModel> _create;

    public /* synthetic */ C4395iM1(Function0 function0, String str, InterfaceC6659su0 interfaceC6659su0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : interfaceC6659su0);
    }

    @Override // defpackage.L01, defpackage.InterfaceC7076ut0
    @NotNull
    public TModel create(@Nullable JSONObject jsonObject) {
        TModel tmodelInvoke = this._create.invoke();
        if (jsonObject != null) {
            tmodelInvoke.initializeFromJson(jsonObject);
        }
        return tmodelInvoke;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4395iM1(@NotNull Function0<? extends TModel> _create, @Nullable String str, @Nullable InterfaceC6659su0 interfaceC6659su0) {
        super(str, interfaceC6659su0);
        Intrinsics.checkNotNullParameter(_create, "_create");
        this._create = _create;
        load();
    }
}
