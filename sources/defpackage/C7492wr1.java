package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Map;

/* JADX INFO: renamed from: wr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class(creator = "RemoteMessageCreator")
@SafeParcelable.Reserved({1})
public final class C7492wr1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C7492wr1> CREATOR = new C7702xr1();

    @SafeParcelable.Field(id = 2)
    public final Bundle d;
    public C8092zj e;

    @SafeParcelable.Constructor
    public C7492wr1(@SafeParcelable.Param(id = 2) Bundle bundle) {
        this.d = bundle;
    }

    @NonNull
    public final Map<String, String> getData() {
        if (this.e == null) {
            C8092zj c8092zj = new C8092zj();
            Bundle bundle = this.d;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c8092zj.put(str, str2);
                    }
                }
            }
            this.e = c8092zj;
        }
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.d, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
