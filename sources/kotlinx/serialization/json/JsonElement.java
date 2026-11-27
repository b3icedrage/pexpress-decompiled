package kotlinx.serialization.json;

import defpackage.RJ0;
import defpackage.TG0;
import defpackage.XH1;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@XH1(with = TG0.class)
public abstract class JsonElement {

    @NotNull
    public static final Companion Companion = new Companion();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlinx/serialization/json/JsonElement$Companion;", "", "<init>", "()V", "LRJ0;", "Lkotlinx/serialization/json/JsonElement;", "serializer", "()LRJ0;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final RJ0<JsonElement> serializer() {
            return TG0.a;
        }
    }
}
