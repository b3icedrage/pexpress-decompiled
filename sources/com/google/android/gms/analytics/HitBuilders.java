package com.google.android.gms.analytics;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.internal.gtm.zzfc;
import com.google.android.gms.internal.gtm.zzfu;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class HitBuilders {

    @Deprecated
    public static class AppViewBuilder extends HitBuilder<AppViewBuilder> {
        public AppViewBuilder() {
            set("&t", "screenview");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder addImpression(Product product, String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder addProduct(Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder addPromotion(Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setCampaignParamsFromUrl(@NonNull String str) {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setCustomDimension(int i, @NonNull String str) {
            super.setCustomDimension(i, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setCustomMetric(int i, float f) {
            super.setCustomMetric(i, f);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setNonInteraction(boolean z) {
            super.setNonInteraction(z);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setProductAction(@NonNull ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setPromotionAction(@NonNull String str) {
            super.setPromotionAction(str);
            return this;
        }
    }

    public static class ExceptionBuilder extends HitBuilder<ExceptionBuilder> {
        public ExceptionBuilder() {
            set("&t", "exception");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder addImpression(Product product, String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder addProduct(Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder addPromotion(Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setCampaignParamsFromUrl(@NonNull String str) {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setCustomDimension(int i, @NonNull String str) {
            super.setCustomDimension(i, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setCustomMetric(int i, float f) {
            super.setCustomMetric(i, f);
            return this;
        }

        @NonNull
        public ExceptionBuilder setDescription(@NonNull String str) {
            set("&exd", str);
            return this;
        }

        @NonNull
        public ExceptionBuilder setFatal(boolean z) {
            set("&exf", zzfu.zzc(z));
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setNonInteraction(boolean z) {
            super.setNonInteraction(z);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setProductAction(@NonNull ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setPromotionAction(@NonNull String str) {
            super.setPromotionAction(str);
            return this;
        }
    }

    public static class HitBuilder<T extends HitBuilder> {
        ProductAction zza;
        private final Map zze = new HashMap();
        final Map zzb = new HashMap();
        final List zzc = new ArrayList();
        final List zzd = new ArrayList();

        private final HitBuilder zza(String str, String str2) {
            if (str2 != null) {
                this.zze.put(str, str2);
            }
            return this;
        }

        @NonNull
        public T addImpression(Product product, String str) {
            if (product == null) {
                zzfc.zze("product should be non-null");
                return this;
            }
            if (str == null) {
                str = "";
            }
            if (!this.zzb.containsKey(str)) {
                this.zzb.put(str, new ArrayList());
            }
            ((List) this.zzb.get(str)).add(product);
            return this;
        }

        @NonNull
        public T addProduct(Product product) {
            if (product == null) {
                zzfc.zze("product should be non-null");
                return this;
            }
            this.zzd.add(product);
            return this;
        }

        @NonNull
        public T addPromotion(Promotion promotion) {
            if (promotion == null) {
                zzfc.zze("promotion should be non-null");
                return this;
            }
            this.zzc.add(promotion);
            return this;
        }

        @NonNull
        public Map<String, String> build() {
            HashMap map = new HashMap(this.zze);
            ProductAction productAction = this.zza;
            if (productAction != null) {
                map.putAll(productAction.zza());
            }
            Iterator it = this.zzc.iterator();
            int i = 1;
            while (it.hasNext()) {
                map.putAll(((Promotion) it.next()).zza(zzd.zzl(i)));
                i++;
            }
            Iterator it2 = this.zzd.iterator();
            int i2 = 1;
            while (it2.hasNext()) {
                map.putAll(((Product) it2.next()).zza(zzd.zzj(i2)));
                i2++;
            }
            int i3 = 1;
            for (Map.Entry entry : this.zzb.entrySet()) {
                List list = (List) entry.getValue();
                String strZzg = zzd.zzg(i3);
                Iterator it3 = list.iterator();
                int i4 = 1;
                while (it3.hasNext()) {
                    map.putAll(((Product) it3.next()).zza(strZzg.concat(zzd.zzi(i4))));
                    i4++;
                }
                if (!TextUtils.isEmpty((CharSequence) entry.getKey())) {
                    map.put(strZzg.concat("nm"), (String) entry.getKey());
                }
                i3++;
            }
            return map;
        }

        public String get(@NonNull String str) {
            return (String) this.zze.get(str);
        }

        @NonNull
        public final T set(String str, String str2) {
            if (str != null) {
                this.zze.put(str, str2);
                return this;
            }
            zzfc.zze("HitBuilder.set() called with a null paramName.");
            return this;
        }

        @NonNull
        public final T setAll(Map<String, String> map) {
            if (map == null) {
                return this;
            }
            this.zze.putAll(new HashMap(map));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x005d  */
        /* JADX WARN: Code duplicated, block: B:22:0x006b  */
        /* JADX WARN: Code duplicated, block: B:24:0x0071  */
        /* JADX WARN: Code duplicated, block: B:38:0x0089 A[SYNTHETIC] */
        @NonNull
        public T setCampaignParamsFromUrl(@NonNull String str) {
            Map mapZzf;
            String[] strArr;
            StringBuilder sb;
            int i;
            String string = null;
            if (!TextUtils.isEmpty(str)) {
                if (str.contains("?")) {
                    String[] strArrSplit = str.split("[\\?]");
                    if (strArrSplit.length > 1) {
                        str = strArrSplit[1];
                    }
                }
                if (str.contains("%3D")) {
                    try {
                        str = URLDecoder.decode(str, "UTF-8");
                        mapZzf = zzfu.zzf(str);
                        strArr = new String[]{"dclid", "utm_source", "gclid", "aclid", "utm_campaign", "utm_medium", "utm_term", "utm_content", "utm_id", "anid", "gmob_t"};
                        sb = new StringBuilder();
                        for (i = 0; i < 11; i++) {
                            if (TextUtils.isEmpty((CharSequence) mapZzf.get(strArr[i]))) {
                                if (sb.length() > 0) {
                                    sb.append("&");
                                }
                                sb.append(strArr[i]);
                                sb.append("=");
                                sb.append((String) mapZzf.get(strArr[i]));
                            }
                        }
                        string = sb.toString();
                    } catch (UnsupportedEncodingException unused) {
                    }
                } else if (str.contains("=")) {
                    mapZzf = zzfu.zzf(str);
                    strArr = new String[]{"dclid", "utm_source", "gclid", "aclid", "utm_campaign", "utm_medium", "utm_term", "utm_content", "utm_id", "anid", "gmob_t"};
                    sb = new StringBuilder();
                    while (i < 11) {
                        if (TextUtils.isEmpty((CharSequence) mapZzf.get(strArr[i]))) {
                            if (sb.length() > 0) {
                                sb.append("&");
                            }
                            sb.append(strArr[i]);
                            sb.append("=");
                            sb.append((String) mapZzf.get(strArr[i]));
                        }
                    }
                    string = sb.toString();
                }
            }
            if (TextUtils.isEmpty(string)) {
                return this;
            }
            Map mapZzf2 = zzfu.zzf(string);
            zza("&cc", (String) mapZzf2.get("utm_content"));
            zza("&cm", (String) mapZzf2.get("utm_medium"));
            zza("&cn", (String) mapZzf2.get("utm_campaign"));
            zza("&cs", (String) mapZzf2.get("utm_source"));
            zza("&ck", (String) mapZzf2.get("utm_term"));
            zza("&ci", (String) mapZzf2.get("utm_id"));
            zza("&anid", (String) mapZzf2.get("anid"));
            zza("&gclid", (String) mapZzf2.get("gclid"));
            zza("&dclid", (String) mapZzf2.get("dclid"));
            zza("&aclid", (String) mapZzf2.get("aclid"));
            zza("&gmob_t", (String) mapZzf2.get("gmob_t"));
            return this;
        }

        @NonNull
        public T setCustomDimension(int i, @NonNull String str) {
            set(zzd.zza(i), str);
            return this;
        }

        @NonNull
        public T setCustomMetric(int i, float f) {
            set(zzd.zzd(i), Float.toString(f));
            return this;
        }

        @NonNull
        public T setHitType(@NonNull String str) {
            set("&t", str);
            return this;
        }

        @NonNull
        public T setNewSession() {
            set("&sc", "start");
            return this;
        }

        @NonNull
        public T setNonInteraction(boolean z) {
            set("&ni", zzfu.zzc(z));
            return this;
        }

        @NonNull
        public T setProductAction(@NonNull ProductAction productAction) {
            this.zza = productAction;
            return this;
        }

        @NonNull
        public T setPromotionAction(@NonNull String str) {
            this.zze.put("&promoa", str);
            return this;
        }
    }

    @Deprecated
    public static class ItemBuilder extends HitBuilder<ItemBuilder> {
        public ItemBuilder() {
            set("&t", "item");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder addImpression(Product product, String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder addProduct(Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder addPromotion(Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setCampaignParamsFromUrl(@NonNull String str) {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @NonNull
        public ItemBuilder setCategory(@NonNull String str) {
            set("&iv", str);
            return this;
        }

        @NonNull
        public ItemBuilder setCurrencyCode(@NonNull String str) {
            set("&cu", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setCustomDimension(int i, @NonNull String str) {
            super.setCustomDimension(i, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setCustomMetric(int i, float f) {
            super.setCustomMetric(i, f);
            return this;
        }

        @NonNull
        public ItemBuilder setName(@NonNull String str) {
            set("&in", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setNonInteraction(boolean z) {
            super.setNonInteraction(z);
            return this;
        }

        @NonNull
        public ItemBuilder setPrice(double d) {
            set("&ip", Double.toString(d));
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setProductAction(@NonNull ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setPromotionAction(@NonNull String str) {
            super.setPromotionAction(str);
            return this;
        }

        @NonNull
        public ItemBuilder setQuantity(long j) {
            set("&iq", Long.toString(j));
            return this;
        }

        @NonNull
        public ItemBuilder setSku(@NonNull String str) {
            set("&ic", str);
            return this;
        }

        @NonNull
        public ItemBuilder setTransactionId(@NonNull String str) {
            set("&ti", str);
            return this;
        }
    }

    public static class ScreenViewBuilder extends HitBuilder<ScreenViewBuilder> {
        public ScreenViewBuilder() {
            set("&t", "screenview");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder addImpression(Product product, String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder addProduct(Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder addPromotion(Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setCampaignParamsFromUrl(@NonNull String str) {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setCustomDimension(int i, @NonNull String str) {
            super.setCustomDimension(i, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setCustomMetric(int i, float f) {
            super.setCustomMetric(i, f);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setNonInteraction(boolean z) {
            super.setNonInteraction(z);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setProductAction(@NonNull ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setPromotionAction(@NonNull String str) {
            super.setPromotionAction(str);
            return this;
        }
    }

    public static class SocialBuilder extends HitBuilder<SocialBuilder> {
        public SocialBuilder() {
            set("&t", "social");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder addImpression(Product product, String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder addProduct(Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder addPromotion(Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @NonNull
        public SocialBuilder setAction(@NonNull String str) {
            set("&sa", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setCampaignParamsFromUrl(@NonNull String str) {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setCustomDimension(int i, @NonNull String str) {
            super.setCustomDimension(i, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setCustomMetric(int i, float f) {
            super.setCustomMetric(i, f);
            return this;
        }

        @NonNull
        public SocialBuilder setNetwork(@NonNull String str) {
            set("&sn", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setNonInteraction(boolean z) {
            super.setNonInteraction(z);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setProductAction(@NonNull ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setPromotionAction(@NonNull String str) {
            super.setPromotionAction(str);
            return this;
        }

        @NonNull
        public SocialBuilder setTarget(@NonNull String str) {
            set("&st", str);
            return this;
        }
    }

    @Deprecated
    public static class TransactionBuilder extends HitBuilder<TransactionBuilder> {
        public TransactionBuilder() {
            set("&t", "transaction");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder addImpression(Product product, String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder addProduct(Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder addPromotion(Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @NonNull
        public TransactionBuilder setAffiliation(@NonNull String str) {
            set("&ta", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setCampaignParamsFromUrl(@NonNull String str) {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @NonNull
        public TransactionBuilder setCurrencyCode(@NonNull String str) {
            set("&cu", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setCustomDimension(int i, @NonNull String str) {
            super.setCustomDimension(i, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setCustomMetric(int i, float f) {
            super.setCustomMetric(i, f);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setNonInteraction(boolean z) {
            super.setNonInteraction(z);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setProductAction(@NonNull ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setPromotionAction(@NonNull String str) {
            super.setPromotionAction(str);
            return this;
        }

        @NonNull
        public TransactionBuilder setRevenue(double d) {
            set("&tr", Double.toString(d));
            return this;
        }

        @NonNull
        public TransactionBuilder setShipping(double d) {
            set("&ts", Double.toString(d));
            return this;
        }

        @NonNull
        public TransactionBuilder setTax(double d) {
            set("&tt", Double.toString(d));
            return this;
        }

        @NonNull
        public TransactionBuilder setTransactionId(@NonNull String str) {
            set("&ti", str);
            return this;
        }
    }

    public static class EventBuilder extends HitBuilder<EventBuilder> {
        public EventBuilder() {
            set("&t", "event");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder addImpression(Product product, String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder addProduct(Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder addPromotion(Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @NonNull
        public EventBuilder setAction(@NonNull String str) {
            set("&ea", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setCampaignParamsFromUrl(@NonNull String str) {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @NonNull
        public EventBuilder setCategory(@NonNull String str) {
            set("&ec", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setCustomDimension(int i, @NonNull String str) {
            super.setCustomDimension(i, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setCustomMetric(int i, float f) {
            super.setCustomMetric(i, f);
            return this;
        }

        @NonNull
        public EventBuilder setLabel(@NonNull String str) {
            set("&el", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setNonInteraction(boolean z) {
            super.setNonInteraction(z);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setProductAction(@NonNull ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setPromotionAction(@NonNull String str) {
            super.setPromotionAction(str);
            return this;
        }

        @NonNull
        public EventBuilder setValue(long j) {
            set("&ev", Long.toString(j));
            return this;
        }

        public EventBuilder(@NonNull String str, @NonNull String str2) {
            this();
            setCategory(str);
            setAction(str2);
        }
    }

    public static class TimingBuilder extends HitBuilder<TimingBuilder> {
        public TimingBuilder() {
            set("&t", "timing");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder addImpression(Product product, String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder addProduct(Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder addPromotion(Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setCampaignParamsFromUrl(@NonNull String str) {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @NonNull
        public TimingBuilder setCategory(@NonNull String str) {
            set("&utc", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setCustomDimension(int i, @NonNull String str) {
            super.setCustomDimension(i, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setCustomMetric(int i, float f) {
            super.setCustomMetric(i, f);
            return this;
        }

        @NonNull
        public TimingBuilder setLabel(@NonNull String str) {
            set("&utl", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setNonInteraction(boolean z) {
            super.setNonInteraction(z);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setProductAction(@NonNull ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ HitBuilder setPromotionAction(@NonNull String str) {
            super.setPromotionAction(str);
            return this;
        }

        @NonNull
        public TimingBuilder setValue(long j) {
            set("&utt", Long.toString(j));
            return this;
        }

        @NonNull
        public TimingBuilder setVariable(@NonNull String str) {
            set("&utv", str);
            return this;
        }

        public TimingBuilder(@NonNull String str, @NonNull String str2, long j) {
            this();
            setVariable(str2);
            setValue(j);
            setCategory(str);
        }
    }
}
