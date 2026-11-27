package io.sentry.util.network;

import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    @Nullable
    public final Serializable a;

    @Nullable
    public final List<EnumC0405a> b;

    /* JADX INFO: renamed from: io.sentry.util.network.a$a, reason: collision with other inner class name */
    public enum EnumC0405a {
        JSON_TRUNCATED("JSON_TRUNCATED"),
        TEXT_TRUNCATED("TEXT_TRUNCATED"),
        INVALID_JSON("INVALID_JSON"),
        BODY_PARSE_ERROR("BODY_PARSE_ERROR");

        private final String value;

        EnumC0405a(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    public a(@Nullable Serializable serializable, @Nullable List list) {
        this.a = serializable;
        this.b = list;
    }

    public final String toString() {
        return "NetworkBody{body=" + this.a + ", warnings=" + this.b + '}';
    }
}
