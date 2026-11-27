package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: renamed from: xr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7702xr1 implements Parcelable.Creator<C7492wr1> {
    @Override // android.os.Parcelable.Creator
    public final C7492wr1 createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Bundle bundleCreateBundle = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(header) != 2) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C7492wr1(bundleCreateBundle);
    }

    @Override // android.os.Parcelable.Creator
    public final C7492wr1[] newArray(int i) {
        return new C7492wr1[i];
    }
}
