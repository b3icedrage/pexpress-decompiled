package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.NonNull;
import com.pexpress.tool.R;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: Sp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2015Sp {
    public final a a;
    public final a b = new a();
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final int j;
    public final int k;
    public final int l;

    /* JADX INFO: renamed from: Sp$a */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0145a();
        public Integer A;
        public int d;
        public Integer e;
        public Integer g;
        public Integer h;
        public Integer i;
        public Integer j;
        public Integer k;
        public Integer l;
        public Locale p;
        public CharSequence q;
        public int r;
        public int s;
        public Integer t;
        public Integer v;
        public Integer w;
        public Integer x;
        public Integer y;
        public Integer z;
        public int m = 255;
        public int n = -2;
        public int o = -2;
        public Boolean u = Boolean.TRUE;

        /* JADX INFO: renamed from: Sp$a$a, reason: collision with other inner class name */
        public class C0145a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            @NonNull
            public final a createFromParcel(@NonNull Parcel parcel) {
                a aVar = new a();
                aVar.m = 255;
                aVar.n = -2;
                aVar.o = -2;
                aVar.u = Boolean.TRUE;
                aVar.d = parcel.readInt();
                aVar.e = (Integer) parcel.readSerializable();
                aVar.g = (Integer) parcel.readSerializable();
                aVar.h = (Integer) parcel.readSerializable();
                aVar.i = (Integer) parcel.readSerializable();
                aVar.j = (Integer) parcel.readSerializable();
                aVar.k = (Integer) parcel.readSerializable();
                aVar.l = (Integer) parcel.readSerializable();
                aVar.m = parcel.readInt();
                aVar.n = parcel.readInt();
                aVar.o = parcel.readInt();
                aVar.q = parcel.readString();
                aVar.r = parcel.readInt();
                aVar.t = (Integer) parcel.readSerializable();
                aVar.v = (Integer) parcel.readSerializable();
                aVar.w = (Integer) parcel.readSerializable();
                aVar.x = (Integer) parcel.readSerializable();
                aVar.y = (Integer) parcel.readSerializable();
                aVar.z = (Integer) parcel.readSerializable();
                aVar.A = (Integer) parcel.readSerializable();
                aVar.u = (Boolean) parcel.readSerializable();
                aVar.p = (Locale) parcel.readSerializable();
                return aVar;
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final a[] newArray(int i) {
                return new a[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeInt(this.d);
            parcel.writeSerializable(this.e);
            parcel.writeSerializable(this.g);
            parcel.writeSerializable(this.h);
            parcel.writeSerializable(this.i);
            parcel.writeSerializable(this.j);
            parcel.writeSerializable(this.k);
            parcel.writeSerializable(this.l);
            parcel.writeInt(this.m);
            parcel.writeInt(this.n);
            parcel.writeInt(this.o);
            CharSequence charSequence = this.q;
            parcel.writeString(charSequence == null ? null : charSequence.toString());
            parcel.writeInt(this.r);
            parcel.writeSerializable(this.t);
            parcel.writeSerializable(this.v);
            parcel.writeSerializable(this.w);
            parcel.writeSerializable(this.x);
            parcel.writeSerializable(this.y);
            parcel.writeSerializable(this.z);
            parcel.writeSerializable(this.A);
            parcel.writeSerializable(this.u);
            parcel.writeSerializable(this.p);
        }
    }

    public C2015Sp(Context context, a aVar) {
        AttributeSet attributeSet;
        int styleAttribute;
        int next;
        a aVar2 = aVar == null ? new a() : aVar;
        int i = aVar2.d;
        if (i != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                attributeSet = attributeSetAsAttributeSet;
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayD = C7001uY1.d(context, attributeSet, C2083Tl1.c, R.attr.badgeStyle, styleAttribute == 0 ? R.style.Widget_MaterialComponents_Badge : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.c = typedArrayD.getDimensionPixelSize(3, -1);
        this.i = typedArrayD.getDimensionPixelSize(8, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        this.j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.k = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.d = typedArrayD.getDimensionPixelSize(11, -1);
        this.e = typedArrayD.getDimension(9, resources.getDimension(R.dimen.m3_badge_size));
        this.g = typedArrayD.getDimension(14, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f = typedArrayD.getDimension(2, resources.getDimension(R.dimen.m3_badge_size));
        this.h = typedArrayD.getDimension(10, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.l = typedArrayD.getInt(19, 1);
        a aVar3 = this.b;
        int i2 = aVar2.m;
        aVar3.m = i2 == -2 ? 255 : i2;
        CharSequence charSequence = aVar2.q;
        aVar3.q = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        a aVar4 = this.b;
        int i3 = aVar2.r;
        aVar4.r = i3 == 0 ? R.plurals.mtrl_badge_content_description : i3;
        int i4 = aVar2.s;
        aVar4.s = i4 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i4;
        Boolean bool = aVar2.u;
        aVar4.u = Boolean.valueOf(bool == null || bool.booleanValue());
        a aVar5 = this.b;
        int i5 = aVar2.o;
        aVar5.o = i5 == -2 ? typedArrayD.getInt(17, 4) : i5;
        int i6 = aVar2.n;
        if (i6 != -2) {
            this.b.n = i6;
        } else if (typedArrayD.hasValue(18)) {
            this.b.n = typedArrayD.getInt(18, 0);
        } else {
            this.b.n = -1;
        }
        a aVar6 = this.b;
        Integer num = aVar2.i;
        aVar6.i = Integer.valueOf(num == null ? typedArrayD.getResourceId(4, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        a aVar7 = this.b;
        Integer num2 = aVar2.j;
        aVar7.j = Integer.valueOf(num2 == null ? typedArrayD.getResourceId(5, 0) : num2.intValue());
        a aVar8 = this.b;
        Integer num3 = aVar2.k;
        aVar8.k = Integer.valueOf(num3 == null ? typedArrayD.getResourceId(12, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        a aVar9 = this.b;
        Integer num4 = aVar2.l;
        aVar9.l = Integer.valueOf(num4 == null ? typedArrayD.getResourceId(13, 0) : num4.intValue());
        a aVar10 = this.b;
        Integer num5 = aVar2.e;
        aVar10.e = Integer.valueOf(num5 == null ? MX0.b(context, typedArrayD, 0).getDefaultColor() : num5.intValue());
        a aVar11 = this.b;
        Integer num6 = aVar2.h;
        aVar11.h = Integer.valueOf(num6 == null ? typedArrayD.getResourceId(6, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = aVar2.g;
        if (num7 != null) {
            this.b.g = num7;
        } else if (typedArrayD.hasValue(7)) {
            this.b.g = Integer.valueOf(MX0.b(context, typedArrayD, 7).getDefaultColor());
        } else {
            int iIntValue = this.b.h.intValue();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, C2083Tl1.N);
            typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList colorStateListB = MX0.b(context, typedArrayObtainStyledAttributes, 3);
            MX0.b(context, typedArrayObtainStyledAttributes, 4);
            MX0.b(context, typedArrayObtainStyledAttributes, 5);
            typedArrayObtainStyledAttributes.getInt(2, 0);
            typedArrayObtainStyledAttributes.getInt(1, 1);
            int i7 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
            typedArrayObtainStyledAttributes.getResourceId(i7, 0);
            typedArrayObtainStyledAttributes.getString(i7);
            typedArrayObtainStyledAttributes.getBoolean(14, false);
            MX0.b(context, typedArrayObtainStyledAttributes, 6);
            typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iIntValue, C2083Tl1.A);
            typedArrayObtainStyledAttributes2.hasValue(0);
            typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes2.recycle();
            this.b.g = Integer.valueOf(colorStateListB.getDefaultColor());
        }
        a aVar12 = this.b;
        Integer num8 = aVar2.t;
        aVar12.t = Integer.valueOf(num8 == null ? typedArrayD.getInt(1, 8388661) : num8.intValue());
        a aVar13 = this.b;
        Integer num9 = aVar2.v;
        aVar13.v = Integer.valueOf(num9 == null ? typedArrayD.getDimensionPixelOffset(15, 0) : num9.intValue());
        a aVar14 = this.b;
        Integer num10 = aVar2.w;
        aVar14.w = Integer.valueOf(num10 == null ? typedArrayD.getDimensionPixelOffset(20, 0) : num10.intValue());
        a aVar15 = this.b;
        Integer num11 = aVar2.x;
        aVar15.x = Integer.valueOf(num11 == null ? typedArrayD.getDimensionPixelOffset(16, aVar15.v.intValue()) : num11.intValue());
        a aVar16 = this.b;
        Integer num12 = aVar2.y;
        aVar16.y = Integer.valueOf(num12 == null ? typedArrayD.getDimensionPixelOffset(21, aVar16.w.intValue()) : num12.intValue());
        a aVar17 = this.b;
        Integer num13 = aVar2.z;
        aVar17.z = Integer.valueOf(num13 == null ? 0 : num13.intValue());
        a aVar18 = this.b;
        Integer num14 = aVar2.A;
        aVar18.A = Integer.valueOf(num14 != null ? num14.intValue() : 0);
        typedArrayD.recycle();
        Locale locale = aVar2.p;
        if (locale == null) {
            this.b.p = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.b.p = locale;
        }
        this.a = aVar2;
    }

    public final boolean a() {
        return this.b.n != -1;
    }
}
