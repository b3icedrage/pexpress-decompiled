package com.google.android.gms.analytics.ecommerce;

import androidx.annotation.NonNull;
import com.google.android.gms.analytics.zzd;
import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Product {
    final Map zza = new HashMap();

    @NonNull
    public Product setBrand(@NonNull String str) {
        zzb("br", str);
        return this;
    }

    @NonNull
    public Product setCategory(@NonNull String str) {
        zzb("ca", str);
        return this;
    }

    @NonNull
    public Product setCouponCode(@NonNull String str) {
        zzb("cc", str);
        return this;
    }

    @NonNull
    public Product setCustomDimension(int i, @NonNull String str) {
        zzb(zzd.zzc(i), str);
        return this;
    }

    @NonNull
    public Product setCustomMetric(int i, int i2) {
        zzb(zzd.zzf(i), Integer.toString(i2));
        return this;
    }

    @NonNull
    public Product setId(@NonNull String str) {
        zzb("id", str);
        return this;
    }

    @NonNull
    public Product setName(@NonNull String str) {
        zzb("nm", str);
        return this;
    }

    @NonNull
    public Product setPosition(int i) {
        zzb("ps", Integer.toString(i));
        return this;
    }

    @NonNull
    public Product setPrice(double d) {
        zzb("pr", Double.toString(d));
        return this;
    }

    @NonNull
    public Product setQuantity(int i) {
        zzb("qt", Integer.toString(i));
        return this;
    }

    @NonNull
    public Product setVariant(@NonNull String str) {
        zzb("va", str);
        return this;
    }

    @NonNull
    public String toString() {
        return zzj.zzb(this.zza);
    }

    @NonNull
    public final Map zza(@NonNull String str) {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.zza.entrySet()) {
            String strValueOf = String.valueOf((String) entry.getKey());
            map.put(str.concat(strValueOf), (String) entry.getValue());
        }
        return map;
    }

    public final void zzb(String str, String str2) {
        Preconditions.checkNotNull(str, "Name should be non-null");
        this.zza.put(str, str2);
    }
}
