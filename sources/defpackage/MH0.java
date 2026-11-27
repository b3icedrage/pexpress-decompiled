package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class MH0 extends KH0 {

    @NotNull
    public final JsonObject j;

    @NotNull
    public final List<String> k;
    public final int l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MH0(@NotNull AbstractC5267mG0 json, @NotNull JsonObject value) {
        super(json, value, null, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.j = value;
        List<String> listE0 = CollectionsKt.e0(value.d.keySet());
        this.k = listE0;
        this.l = listE0.size() * 2;
        this.m = -1;
    }

    @Override // defpackage.KH0, defpackage.AbstractC7317w21
    @NotNull
    public final String S(@NotNull MH1 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.k.get(i / 2);
    }

    @Override // defpackage.KH0, defpackage.AbstractC5418n0
    @NotNull
    public final JsonElement U(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (this.m % 2 != 0) {
            return (JsonElement) PW0.d(this.j, tag);
        }
        C6508sA0 c6508sA0 = MG0.a;
        return tag == null ? JsonNull.INSTANCE : new C3959gH0(true, tag);
    }

    @Override // defpackage.KH0, defpackage.AbstractC5418n0
    public final JsonElement X() {
        return this.j;
    }

    @Override // defpackage.KH0
    @NotNull
    /* JADX INFO: renamed from: Z */
    public final JsonObject X() {
        return this.j;
    }

    @Override // defpackage.KH0, defpackage.AbstractC5418n0, defpackage.EH
    public final void b(@NotNull MH1 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // defpackage.KH0, defpackage.EH
    public final int h(@NotNull MH1 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i = this.m;
        if (i >= this.l - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.m = i2;
        return i2;
    }
}
