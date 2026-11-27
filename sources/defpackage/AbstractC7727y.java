package defpackage;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public abstract class AbstractC7727y implements Parcelable {
    public final Parcelable d;
    public static final a e = new a();
    public static final Parcelable.Creator<AbstractC7727y> CREATOR = new b();

    /* JADX INFO: renamed from: y$a */
    public class a extends AbstractC7727y {
    }

    public AbstractC7727y() {
        this.d = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.d, i);
    }

    /* JADX INFO: renamed from: y$b */
    public class b implements Parcelable.ClassLoaderCreator<AbstractC7727y> {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return AbstractC7727y.e;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AbstractC7727y[i];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final AbstractC7727y createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbstractC7727y.e;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    public AbstractC7727y(@NonNull Parcelable parcelable) {
        if (parcelable != null) {
            this.d = parcelable == e ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC7727y(@NonNull Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.d = parcelable == null ? e : parcelable;
    }
}
