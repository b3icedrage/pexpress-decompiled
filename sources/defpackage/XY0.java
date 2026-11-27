package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class XY0 implements Parcelable {

    public static final class a extends XY0 {
        public static final Parcelable.Creator<a> CREATOR = new C0192a();

        @NotNull
        public final String d;

        @NotNull
        public final Object e;

        @Nullable
        public final LM1 g;

        @NotNull
        public final Object h;

        /* JADX INFO: renamed from: XY0$a$a, reason: collision with other inner class name */
        public static class C0192a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel in) {
                Intrinsics.checkNotNullParameter(in, "in");
                String string = in.readString();
                ArrayList<String> arrayListCreateStringArrayList = in.createStringArrayList();
                LM1 lm1 = (LM1) in.readParcelable(a.class.getClassLoader());
                int i = in.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                while (i != 0) {
                    linkedHashMap.put(in.readString(), in.readString());
                    i--;
                }
                return new a(string, arrayListCreateStringArrayList, lm1, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i) {
                return new a[i];
            }
        }

        public a(@NotNull String base, @NotNull List<String> transformations, @Nullable LM1 lm1, @NotNull Map<String, String> parameters) {
            Intrinsics.checkNotNullParameter(base, "base");
            Intrinsics.checkNotNullParameter(transformations, "transformations");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.d = base;
            this.e = transformations;
            this.g = lm1;
            this.h = parameters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.a(this.d, aVar.d) && Intrinsics.a(this.e, aVar.e) && Intrinsics.a(this.g, aVar.g) && Intrinsics.a(this.h, aVar.h);
        }

        public final int hashCode() {
            String str = this.d;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            Object obj = this.e;
            int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
            LM1 lm1 = this.g;
            int iHashCode3 = (iHashCode2 + (lm1 != null ? lm1.hashCode() : 0)) * 31;
            Object obj2 = this.h;
            return iHashCode3 + (obj2 != null ? obj2.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Complex(base=");
            sb.append(this.d);
            sb.append(", transformations=");
            sb.append(this.e);
            sb.append(", size=");
            sb.append(this.g);
            sb.append(", parameters=");
            return K1.a(sb, this.h, ")");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map$Entry] */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeString(this.d);
            parcel.writeStringList(this.e);
            parcel.writeParcelable(this.g, i);
            ?? r4 = this.h;
            parcel.writeInt(r4.size());
            for (?? r0 : r4.entrySet()) {
                parcel.writeString((String) r0.getKey());
                parcel.writeString((String) r0.getValue());
            }
        }
    }
}
